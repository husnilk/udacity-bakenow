package net.husnilkamil.bakenow.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by husnilk on 9/12/2017.
 */

public class RecipeClient {

    static final String BASE_URL = "https://d17h27t6h515a5.cloudfront.net";

    private static Retrofit retrofit;

    public static Retrofit getClient() {

        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

    }

}
