package uz.gita.currencyconverter.domain.usecase.implimport kotlinx.coroutines.flow.Flowimport uz.gita.currencyconverter.domain.models.CurrencyParamimport uz.gita.currencyconverter.domain.repository.CurrencyRepositoryimport uz.gita.currencyconverter.domain.usecase.CurrencyUseCaseimport javax.inject.Injectclass CurrencyUseCaseImpl @Inject constructor(    private val repository: CurrencyRepository,) : CurrencyUseCase {    override fun invoke(): Flow<List<CurrencyParam>> = repository.getAllCurrency()}