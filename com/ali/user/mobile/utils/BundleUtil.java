package com.ali.user.mobile.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.model.CommonCallback;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class BundleUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.BundleUitl";

    static {
        kge.a(666301706);
    }

    public static Bundle jsonStringToBundle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("7a0a702b", new Object[]{str});
        }
        Bundle bundle = new Bundle();
        if (StringUtils.isEmpty(str)) {
            return bundle;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return bundle;
    }

    public static Bundle serialBundle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("f4537aab", new Object[]{str});
        }
        Bundle bundle = null;
        if (str != null && str.length() > 0) {
            String[] split = str.split("&");
            bundle = new Bundle();
            for (String str2 : split) {
                int indexOf = str2.indexOf("=");
                if (indexOf > 0 && indexOf < str2.length() - 1) {
                    bundle.putString(str2.substring(0, indexOf), str2.substring(indexOf + 1));
                }
            }
        }
        return bundle;
    }

    public static com.alibaba.fastjson.JSONObject bundleToJSON(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("a125bcf6", new Object[]{str});
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        if (str != null && str.length() > 0) {
            for (String str2 : str.split("&")) {
                int indexOf = str2.indexOf("=");
                if (indexOf > 0 && indexOf < str2.length() - 1) {
                    try {
                        jSONObject.put(str2.substring(0, indexOf), (Object) str2.substring(indexOf + 1));
                    } catch (com.alibaba.fastjson.JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return jSONObject;
    }

    public static boolean isAppInstalled(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fbcdac", new Object[]{context, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static void installed(final String str, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f169bc", new Object[]{str, commonCallback});
        } else if (commonCallback == null) {
        } else {
            if (StringUtils.isEmpty(str)) {
                commonCallback.onFail(-2, "empty package name");
            } else {
                new CoordinatorWrapper().execute(new AsyncTask<Object, Void, Boolean>() { // from class: com.ali.user.mobile.utils.BundleUtil.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.AsyncTask
                    /* renamed from: doInBackground */
                    public Boolean mo112doInBackground(Object[] objArr) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (Boolean) ipChange2.ipc$dispatch("91b7eba9", new Object[]{this, objArr}) : Boolean.valueOf(BundleUtil.isAppInstalled(DataProviderFactory.getApplicationContext(), str));
                    }

                    @Override // android.os.AsyncTask
                    public void onPostExecute(Boolean bool) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b98eb50", new Object[]{this, bool});
                        } else if (bool.booleanValue()) {
                            commonCallback.onSuccess();
                        } else {
                            commonCallback.onFail(-1, "not support alipayHK");
                        }
                    }
                }, new Object[0]);
            }
        }
    }
}
