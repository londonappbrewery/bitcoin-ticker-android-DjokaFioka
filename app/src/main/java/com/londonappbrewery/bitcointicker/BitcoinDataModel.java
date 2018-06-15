package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Djordje on 15.06.2018..
 */

public class BitcoinDataModel
{
    private String mPrice;

    public static BitcoinDataModel fromJSON(JSONObject jsonObject)
    {
        BitcoinDataModel bitcoinData = new BitcoinDataModel();
        try
        {
            double bitcoinPrice = jsonObject.getDouble("last");
            bitcoinData.mPrice = Double.toString(bitcoinPrice);
            return bitcoinData;
        }
        catch (JSONException e)
        {
            e.printStackTrace();
            return null;
        }

    }

    public String getPrice()
    {
        return mPrice;
    }
}
