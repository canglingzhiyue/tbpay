package com.taobao.taopai.windvane;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taopai.business.common.ReturnType;
import com.taobao.vessel.utils.c;
import java.util.HashMap;
import java.util.Map;
import tb.icc;
import tb.kge;

/* loaded from: classes8.dex */
public class TPVideoWvPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION = "openRecord";
    public static final String KEY_PAGE_URL = "pageUrl";
    public static final String PLUGIN_NAME = "TaoPaiWVPlugin";
    private static final int REQUEST_CODE_FROM_EDIT = 60001;
    private static final String TAG = "TPVideoWvPlugin";
    private String mBizScene = "";
    private WVCallBackContext mWVCallBackContext;

    static {
        kge.a(-1116052814);
    }

    public static /* synthetic */ Object ipc$super(TPVideoWvPlugin tPVideoWvPlugin, String str, Object... objArr) {
        if (str.hashCode() == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (ACTION.equals(str) && !TextUtils.isEmpty(str2)) {
            this.mWVCallBackContext = wVCallBackContext;
            HashMap hashMap = (HashMap) JSONObject.parseObject(str2, new TypeReference<HashMap<String, String>>() { // from class: com.taobao.taopai.windvane.TPVideoWvPlugin.1
            }, new Feature[0]);
            if (hashMap == null || hashMap.isEmpty()) {
                if (this.mWVCallBackContext != null) {
                    r rVar = new r();
                    rVar.a("message", this.mContext.getString(R.string.pissarro_params_error));
                    this.mWVCallBackContext.error(rVar);
                }
                TLog.loge(TAG, "input params error, " + str2);
            } else {
                this.mBizScene = (String) hashMap.get("biz_scene");
                if (TextUtils.isEmpty(this.mBizScene)) {
                    this.mBizScene = (String) hashMap.get(ag.KEY_TAOKE_BIZSCENE);
                }
                a.a(this.mBizScene);
                if (!hashMap.containsKey("return_page")) {
                    hashMap.put("return_page", ReturnType.EDIT.desc);
                }
                Uri.Builder builder = null;
                String str3 = (String) hashMap.get("pageUrl");
                if (str3 != null && (parse = Uri.parse(str3)) != null) {
                    builder = parse.buildUpon();
                }
                if (builder == null) {
                    builder = new Uri.Builder().scheme("http").authority("h5.m.taobao.com").path("/taopai/record.html");
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                        builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (this.mContext instanceof Activity) {
                    Nav.from(this.mContext).forResult(60001).toUri(builder.build());
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        TLog.loge(TAG, "onActivityResult resultCode = " + i2);
        if (i != 60001) {
            return;
        }
        if (i2 != -1 || intent == null) {
            this.mWVCallBackContext.error("HY_SUCCESS");
            if (intent != null) {
                TLog.loge(TAG, "onActivityResult Cancel " + intent.toString());
            }
            a.a(this.mBizScene, "cancel");
            return;
        }
        r rVar = new r();
        if (intent != null) {
            icc.a(intent, rVar);
            HashMap hashMap = (HashMap) JSON.parseObject(intent.getStringExtra("other_params_map"), HashMap.class);
            if (hashMap != null) {
                for (String str : hashMap.keySet()) {
                    rVar.a(str, (String) hashMap.get(str));
                }
            }
            String str2 = "wvplugin callback: " + rVar;
            TLog.loge(TAG, "onActivityResult Success " + rVar.d());
            a.b(this.mBizScene);
            this.mWVCallBackContext.success(rVar);
            return;
        }
        rVar.a("HY_FAILED");
        rVar.a("msg", this.mContext.getString(R.string.pissarro_common_error));
        this.mWVCallBackContext.error(rVar);
        TLog.loge(TAG, "onActivityResult Error");
        a.a(this.mBizScene, c.LOAD_DATA_NULL);
    }
}
