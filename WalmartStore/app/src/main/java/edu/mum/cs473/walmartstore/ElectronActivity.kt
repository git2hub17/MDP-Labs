package edu.mum.cs473.walmartstore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ElectronActivity : AppCompatActivity() {

    var r1: RecyclerView? = null
    var layoutManager: RecyclerView.LayoutManager? = null
    var s1 : Array<String>? = null
    var s2 : Array<String>? = null
    var s3 : Array<String>? = null
    var s4 : ArrayList<String>? = null
    var myadapter : MyAdapter? = null

    var imageges = intArrayOf(
        R.drawable.macboook,
        R.drawable.note10,
        R.drawable.tablet,
        R.drawable.tv,
        R.drawable.printer
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_electron)

        r1 = findViewById<RecyclerView>(R.id.recyclerView1)
        s1 = resources.getStringArray(R.array.elect)
        s2 = resources.getStringArray(R.array.desc)
        s3 = resources.getStringArray(R.array.detail)
        myadapter = MyAdapter(this, s1 as Array<String>, s2 as Array<String>, imageges, s3 as Array<String>)
        layoutManager = LinearLayoutManager(this)
        r1?.layoutManager = layoutManager
        r1?.adapter = myadapter
    }
}
