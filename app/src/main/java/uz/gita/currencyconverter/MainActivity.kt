package uz.gita.currencyconverter

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.lifecycleScope
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.currencyconverter.presenter.screens.main.MainScreen
import uz.gita.currencyconverter.ui.theme.CurrencyConverterTheme
import uz.gita.currencyconverter.utils.navigation.AppNavigatorHandler
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var appNavigatorHandler: AppNavigatorHandler

    @SuppressLint("FlowOperatorInvokedInComposition", "CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurrencyConverterTheme {
                Navigator(MainScreen()) { nav ->
                    appNavigatorHandler.uiNavigator.onEach {
                        it.invoke(nav)
                    }.launchIn(lifecycleScope)
                    CurrentScreen()
                }
            }
        }
    }
}