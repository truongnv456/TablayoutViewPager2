import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import navigationcomponentturtorialcom.example.tablayoutviewpager2.FragmentOne
import navigationcomponentturtorialcom.example.tablayoutviewpager2.FragmentThree
import navigationcomponentturtorialcom.example.tablayoutviewpager2.FragmentTwo

class MyFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    /*    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FragmentOne()
            1 -> FragmentTwo()
            2 -> FragmentThree()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }

    override fun getCount(): Int {
        return 3
    }*/
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentOne()
            1 -> FragmentTwo()
            2 -> FragmentThree()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}
