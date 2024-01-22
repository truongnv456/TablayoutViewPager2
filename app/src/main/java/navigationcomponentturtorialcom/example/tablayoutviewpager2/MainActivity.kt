package navigationcomponentturtorialcom.example.tablayoutviewpager2

import MyFragmentAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.viewPager2)

        fragmentManager = supportFragmentManager
        val adapter = MyFragmentAdapter(fragmentManager, lifecycle)
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout,viewPager2) { tab, pos ->
            when(pos) {
                0 -> {tab.text = "Fragment1"}
                1 -> {tab.text = "Fragment2"}
                else -> {tab.text = "Fragment3"}
            }
        }.attach()

    }
}