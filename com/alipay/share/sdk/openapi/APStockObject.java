package com.alipay.share.sdk.openapi;

import android.os.Bundle;
import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.APMediaMessage;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class APStockObject implements APMediaMessage.IMediaObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int status;
    public String stockCode;
    public String stockName;
    public String stockPrice;
    public String stockPriceChange;
    public String stockPriceChangeRatio;
    public long time = System.currentTimeMillis();
    public String webUrl;

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public boolean checkArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30f26010", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 120;
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16284a0d", new Object[]{this, bundle});
            return;
        }
        bundle.putString(Constant.EXTRA_STOCK_OBJECT_NAME, this.stockName);
        bundle.putString(Constant.EXTRA_STOCK_OBJECT_CODE, this.stockCode);
        bundle.putString(Constant.EXTRA_STOCK_OBJECT_PRICE, this.stockPrice);
        bundle.putString(Constant.EXTRA_STOCK_OBJECT_PRICE_CHANGE, this.stockPriceChange);
        bundle.putString(Constant.EXTRA_STOCK_OBJECT_PRICE_CHANGE_RATIO, this.stockPriceChangeRatio);
        bundle.putLong(Constant.EXTRA_STOCK_OBJECT_TIME, this.time);
        bundle.putInt(Constant.EXTRA_STOCK_OBJECT_STATUS, this.status);
        bundle.putString(Constant.EXTRA_STOCK_OBJECT_URL, this.webUrl);
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185fb4a6", new Object[]{this, bundle});
            return;
        }
        this.stockName = bundle.getString(Constant.EXTRA_STOCK_OBJECT_NAME);
        this.stockCode = bundle.getString(Constant.EXTRA_STOCK_OBJECT_CODE);
        this.stockPrice = bundle.getString(Constant.EXTRA_STOCK_OBJECT_PRICE);
        this.stockPriceChange = bundle.getString(Constant.EXTRA_STOCK_OBJECT_PRICE_CHANGE);
        this.stockPriceChangeRatio = bundle.getString(Constant.EXTRA_STOCK_OBJECT_PRICE_CHANGE_RATIO);
        this.webUrl = bundle.getString(Constant.EXTRA_STOCK_OBJECT_URL);
        this.time = bundle.getLong(Constant.EXTRA_STOCK_OBJECT_TIME);
        this.status = bundle.getInt(Constant.EXTRA_STOCK_OBJECT_STATUS);
    }
}
