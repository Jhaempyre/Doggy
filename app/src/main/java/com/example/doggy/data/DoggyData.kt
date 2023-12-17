package com.example.doggy.data

import com.example.doggy.Doggy_Data
import com.example.doggy.R
import com.example.doggy.model.Doggy



class DoggyData {
    fun loadDoggy():List<Doggy>{
        return listOf(
            Doggy(R.string.us_0,R.string.m1,R.drawable.us_0),
            Doggy(R.string.us_1,R.string.m2,R.drawable.us_1),
            Doggy(R.string.us_2,R.string.m3,R.drawable.us_2),
            Doggy(R.string.us_3,R.string.m4,R.drawable.us_3),
            Doggy(R.string.us_4,R.string.m5,R.drawable.us_4),
            Doggy(R.string.us_5,R.string.m6,R.drawable.us_5),
            Doggy(R.string.us_6,R.string.m7,R.drawable.us_6),
            Doggy(R.string.us_7,R.string.m8,R.drawable.us_7),
            Doggy(R.string.us_8,R.string.m9,R.drawable.us_8),
            Doggy(R.string.us_9,R.string.m10,R.drawable.us_9),
            Doggy(R.string.us_10,R.string.m11,R.drawable.us_10),
            Doggy(R.string.us_11,R.string.m12,R.drawable.us_11)
            )
    }


}

val dogs= DoggyData().loadDoggy()
