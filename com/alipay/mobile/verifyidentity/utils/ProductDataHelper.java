package com.alipay.mobile.verifyidentity.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ProductDataHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CLICK_CLOSE = "click_clo";
    public static final String KEY_CLICK_FORGET = "click_4get";
    public static final String KEY_CLICK_OTHER = "click_oth";
    public static final String KEY_COST = "cost";
    public static final String KEY_INIT = "init";
    public static final String KEY_LOCAL_VERIFY = "l_verify";
    public static final String KEY_LOCKED = "locked";
    public static final String KEY_MODIFY = "modify";
    public static final String KEY_PRODUCT = "pd";
    public static final String KEY_PROVERIFYRESULT = "proverifyresult";
    public static final String KEY_VERIFY = "verify";
    public static final String VAL_PRODUCT_FACE = "face";
    public static final String VAL_PRODUCT_FACE_ID = "faceId";
    public static final String VAL_PRODUCT_FP = "fp";
    public static final String VAL_PRODUCT_PWD = "pwd";
    public static final String VAL_PRODUCT_SWIPE = "swipe";

    /* renamed from: a  reason: collision with root package name */
    private static volatile ProductDataHelper f6100a;
    private boolean b;
    private long c;
    private JSONArray d = new JSONArray();
    private JSONObject e = new JSONObject();

    private ProductDataHelper() {
    }

    public static ProductDataHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProductDataHelper) ipChange.ipc$dispatch("9efe3bcc", new Object[0]);
        }
        if (f6100a == null) {
            synchronized (ProductDataHelper.class) {
                if (f6100a == null) {
                    f6100a = new ProductDataHelper();
                }
            }
        }
        return f6100a;
    }

    public void commitRecord() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ccf8cef", new Object[]{this});
            return;
        }
        try {
            VerifyLogCat.i("ProductDataHelper", "commitRecord");
            if (this.d == null) {
                this.d = new JSONArray();
            }
            if (!this.e.isEmpty()) {
                this.d.add(this.e);
            }
            this.e = new JSONObject();
            this.c = System.currentTimeMillis();
        } catch (Throwable unused) {
        }
    }

    public void startRecord(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb75a4", new Object[]{this, str});
            return;
        }
        try {
            VerifyLogCat.i("ProductDataHelper", "startRecord type: " + str);
            if (this.e == null) {
                this.e = new JSONObject();
            }
            if (!this.e.isEmpty()) {
                commitRecord();
            }
            this.c = System.currentTimeMillis();
            this.e.put("pd", (Object) str);
        } catch (Throwable unused) {
        }
    }

    public boolean canTrustTransfer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7c3777e", new Object[]{this})).booleanValue() : this.b;
    }

    public void setTrustTransfer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac126ac", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void write(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdead50c", new Object[]{this, str, obj});
        } else {
            write(str, obj, false);
        }
    }

    public void write(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef707f48", new Object[]{this, str, obj, new Boolean(z)});
            return;
        }
        try {
            VerifyLogCat.i("ProductDataHelper", "write key: " + str + ", value: " + obj);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.e == null) {
                this.e = new JSONObject();
            }
            this.e.put(str, obj);
            if (!z) {
                return;
            }
            commitRecord();
        } catch (Throwable unused) {
        }
    }

    public void recordCostStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0803dcb", new Object[]{this});
        } else {
            this.c = System.currentTimeMillis();
        }
    }

    public void recordCostEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c62e44", new Object[]{this});
            return;
        }
        write("cost", Long.valueOf(System.currentTimeMillis() - this.c));
        this.c = System.currentTimeMillis();
    }

    public void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
            return;
        }
        try {
            VerifyLogCat.i("ProductDataHelper", "clearCache");
            this.d = new JSONArray();
            this.e = new JSONObject();
            this.b = false;
        } catch (Throwable unused) {
        }
    }

    public String generateIISDataStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64becff0", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.addAll(this.d);
        if (!this.e.isEmpty()) {
            jSONArray.add(this.e);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("productData", (Object) jSONArray);
        VerifyLogCat.i("ProductDataHelper", "generateIISDataStr result str: " + jSONObject.toJSONString());
        try {
            return Base64.encodeToString(jSONObject.toJSONString().getBytes(), 2);
        } catch (Throwable th) {
            VerifyLogCat.e("ProductDataHelper", th);
            return jSONObject.toJSONString();
        }
    }
}
