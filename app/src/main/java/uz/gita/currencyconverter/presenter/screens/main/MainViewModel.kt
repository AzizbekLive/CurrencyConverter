package uz.gita.currencyconverter.presenter.screens.mainimport android.util.Logimport androidx.lifecycle.ViewModelimport androidx.lifecycle.viewModelScopeimport dagger.hilt.android.lifecycle.HiltViewModelimport kotlinx.coroutines.Dispatchersimport kotlinx.coroutines.flow.MutableStateFlowimport kotlinx.coroutines.flow.collectimport kotlinx.coroutines.flow.onEachimport kotlinx.coroutines.flow.updateimport kotlinx.coroutines.launchimport kotlinx.coroutines.withContextimport uz.gita.currencyconverter.domain.models.CurrencyParamimport uz.gita.currencyconverter.domain.usecase.CurrencyUseCaseimport javax.inject.Inject@HiltViewModelclass MainViewModel @Inject constructor(    private val useCase: CurrencyUseCase,    private val direction: MainDirection,) : MainContract.ViewModel, ViewModel() {    override val uiState = MutableStateFlow(MainContract.UIState())    override fun onEventDispatcher(intent: MainContract.Intent) {        when (intent) {            is MainContract.Intent.MoveToCurrencyScreen -> {                viewModelScope.launch {                    if (uiState.value.firstClick.Ccy.isEmpty()) {                        Log.d("TTT", "onEventDispatcher: 1 $uiState.value.firstClick.Ccy")                        uiState.update {                            it.copy(firstClick = intent.data)                        }                    } else if (uiState.value.firstClick.Ccy != intent.data.Ccy) {                        Log.d("TTT", "onEventDispatcher: 2 $uiState.value.firstClick.Ccy")                        viewModelScope.launch {                            direction.openCurrencyScreen(uiState.value.firstClick, intent.data)                            uiState.update {                                it.copy(firstClick = CurrencyParam("","","","","","","","","","",1))                            }                        }                    } else {                        Log.d("TTT", "onEventDispatcher: 3 $uiState.value.firstClick.Ccy")                        uiState.update {                            it.copy(firstClick = CurrencyParam("","","","","","","","","","",1))                        }                    }                }            }        }    }    override var currency1: CurrencyParam? = null    override var currency2: CurrencyParam? = null    init {        viewModelScope.launch {            withContext(Dispatchers.IO) {                useCase.invoke().onEach {                    uiState.update { uiState ->                        uiState.copy(currencyList = it)                    }                }.collect()            }        }    }}