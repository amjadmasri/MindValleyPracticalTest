package demo.mindvalleytest.dependencyInjection.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import demo.mindvalleytest.MainActivity

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [FragmentBuilderModule::class])
    abstract fun bindMainActivity(): MainActivity
}