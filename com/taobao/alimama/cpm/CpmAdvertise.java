package com.taobao.alimama.cpm;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.c;
import com.taobao.alimama.net.pojo.response.AlimamaZzAd;
import com.taobao.trtc.api.TrtcConstants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class CpmAdvertise implements Serializable, Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(deserialize = false, serialize = false)
    public BitmapDrawable animatedDrawable;
    @JSONField(name = "bid")
    public String bid;
    @JSONField(deserialize = false, serialize = false)
    public Bitmap bitmap;
    @JSONField(name = "cache_time")
    public long cachetime;
    @JSONField(name = "click_url")
    public String clickUrl;
    @JSONField(deserialize = false, serialize = false)
    public String componentTypes;
    @JSONField(deserialize = false, serialize = false)
    public CpmView cpmView;
    @JSONField(name = "extra")
    public Map<String, String> extra;
    @JSONField(name = "ifs")
    public String ifs;
    @JSONField(name = "image_url")
    public String imageUrl;
    @JSONField(deserialize = false, serialize = false)
    public boolean isGifAd;
    @JSONField(deserialize = false, serialize = false)
    public boolean notCacheComponent;
    @JSONField(name = MspDBHelper.BizEntry.COLUMN_NAME_PID)
    public String pid;
    @JSONField(name = "tmpl")
    public String tmpl;

    static {
        kge.a(1753453042);
        kge.a(1028243835);
        kge.a(-723128125);
    }

    public boolean dataEquals(CpmAdvertise cpmAdvertise) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1456203", new Object[]{this, cpmAdvertise})).booleanValue();
        }
        if (this == cpmAdvertise) {
            return true;
        }
        return cpmAdvertise != null && StringUtils.equals(this.bid, cpmAdvertise.bid) && StringUtils.equals(this.pid, cpmAdvertise.pid) && StringUtils.equals(this.clickUrl, cpmAdvertise.clickUrl) && StringUtils.equals(this.ifs, cpmAdvertise.ifs) && this.cachetime == cpmAdvertise.cachetime && StringUtils.equals(this.tmpl, cpmAdvertise.tmpl) && StringUtils.equals(this.imageUrl, cpmAdvertise.imageUrl);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CpmAdvertise)) {
            return false;
        }
        CpmAdvertise cpmAdvertise = (CpmAdvertise) obj;
        return dataEquals(cpmAdvertise) && simplyCompareBitmap(this.bitmap, cpmAdvertise.bitmap);
    }

    private boolean simplyCompareBitmap(Bitmap bitmap, Bitmap bitmap2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5b98859", new Object[]{this, bitmap, bitmap2})).booleanValue();
        }
        if (bitmap == bitmap2) {
            return true;
        }
        return bitmap != null && bitmap2 != null && bitmap.getHeight() == bitmap2.getHeight() && bitmap.getWidth() == bitmap2.getWidth();
    }

    /* renamed from: clone */
    public CpmAdvertise m826clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmAdvertise) ipChange.ipc$dispatch("3b78f2e3", new Object[]{this});
        }
        try {
            return (CpmAdvertise) super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public void addExtra(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e46cf0a", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            if (this.extra == null) {
                this.extra = new HashMap();
            }
            this.extra.put(str, str2);
        }
    }

    public String getExtra(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84af4295", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || (map = this.extra) == null) {
            return null;
        }
        return map.get(str);
    }

    public static CpmAdvertise from(AlimamaZzAd alimamaZzAd) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmAdvertise) ipChange.ipc$dispatch("5506f807", new Object[]{alimamaZzAd});
        }
        CpmAdvertise cpmAdvertise = new CpmAdvertise();
        cpmAdvertise.clickUrl = alimamaZzAd.eurl;
        cpmAdvertise.bid = alimamaZzAd.bid;
        cpmAdvertise.pid = alimamaZzAd.pid;
        if (alimamaZzAd.extension != null) {
            cpmAdvertise.tmpl = alimamaZzAd.extension.tmpl;
        }
        cpmAdvertise.imageUrl = alimamaZzAd.tbgoodslink;
        try {
            cpmAdvertise.cachetime = Long.parseLong(alimamaZzAd.cachetime);
        } catch (NumberFormatException unused) {
            cpmAdvertise.cachetime = 0L;
        }
        cpmAdvertise.ifs = alimamaZzAd.ifs;
        return cpmAdvertise;
    }

    public static CpmAdvertise from(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CpmAdvertise) ipChange.ipc$dispatch("8eb713de", new Object[]{jSONObject});
        }
        CpmAdvertise cpmAdvertise = new CpmAdvertise();
        cpmAdvertise.clickUrl = jSONObject.getString(c.E_URL);
        cpmAdvertise.bid = jSONObject.getString("bid");
        cpmAdvertise.pid = jSONObject.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
        if (jSONObject.getJSONObject(TrtcConstants.TRTC_PARAMS_EXTENSION) != null) {
            cpmAdvertise.tmpl = jSONObject.getJSONObject(TrtcConstants.TRTC_PARAMS_EXTENSION).getString("tmpl");
        }
        cpmAdvertise.imageUrl = jSONObject.getString("tbgoodslink");
        try {
            cpmAdvertise.cachetime = Long.parseLong(jSONObject.getString("cachetime"));
        } catch (NumberFormatException unused) {
            cpmAdvertise.cachetime = 0L;
        }
        cpmAdvertise.ifs = jSONObject.getString("ifs");
        return cpmAdvertise;
    }
}
