package com.example.firebasechat2.Fragments;

import com.example.firebasechat2.Notifications.MyResponse;
import com.example.firebasechat2.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content_Type:application/json",
                    "Authorization:key=AAAAajxPbsA:APA91bG6F4MLwc-w7rINMhMxiPRkATcEdjjIdxPKQF1RWDRVV69w3e_1t7ajLHyLW7RT0j5gHlip801JOQq__ntXKJEkKrw8RGLB8W_PUvALDQEDPLMtPA3Gh5JQosearZ3Hi4muRhuE"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification (@Body Sender body);
}
