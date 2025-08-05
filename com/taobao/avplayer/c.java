package com.taobao.avplayer;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import tb.kge;

/* loaded from: classes6.dex */
public class c implements ap {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1630323628);
        kge.a(-843888841);
    }

    @Override // com.taobao.avplayer.ap
    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : OrangeConfig.getInstance().getConfig("DWInteractive", str, "");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        String a2 = a("videoCacheEnable2");
        if (TextUtils.isEmpty(a2)) {
            return true;
        }
        try {
            return Boolean.parseBoolean(a2);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // com.taobao.avplayer.ap
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        String a2 = a("httpsSchemeForVideoUrl");
        if (TextUtils.isEmpty(a2)) {
            return true;
        }
        try {
            return Boolean.parseBoolean(a2);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // com.taobao.avplayer.ap
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("DWInteractive", "newPlayerEnable", "true");
            if (!TextUtils.isEmpty(config)) {
                if (Boolean.parseBoolean(config)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // com.taobao.avplayer.ap
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        try {
            List<String> h = h();
            if (h != null && h.size() != 0) {
                for (String str2 : h) {
                    if (!TextUtils.isEmpty(str2) && ("ALL_BIZCODE".equalsIgnoreCase(str2) || str2.equalsIgnoreCase(str))) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.taobao.avplayer.ap
    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        try {
            List<String> i = i();
            if (i != null && i.size() != 0) {
                for (String str2 : i) {
                    if (!TextUtils.isEmpty(str2) && ("ALL_BIZCODE".equalsIgnoreCase(str2) || str2.equalsIgnoreCase(str))) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.taobao.avplayer.ap
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        String a2 = a("enableInstantSeek");
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(a2);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.taobao.avplayer.ap
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        String a2 = a("videoLengthEnable");
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(a2);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.taobao.avplayer.ap
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        String a2 = a("PlayRateBtnEnable");
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(a2);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        String a2 = a("tbNetEnable");
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(a2);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // tb.ddc
    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return OrangeConfig.getInstance().getConfig("DWInteractive", str2, str3);
        }
        return OrangeConfig.getInstance().getConfig(str, str2, str3);
    }

    private List<String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9f84bbd7", new Object[]{this});
        }
        try {
            JSONArray jSONArray = new JSONArray(getConfig("DWInteractive", "optimizeTextureWhiteList", "[\"DETAILMAIN\",\"DETAIL\",\"SHOP\",\"WEITAO\"]"));
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if (!TextUtils.isEmpty(jSONArray.optString(i))) {
                        arrayList.add(jSONArray.optString(i));
                    }
                } catch (Throwable unused) {
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public List<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this});
        }
        try {
            JSONArray jSONArray = new JSONArray(getConfig("DWInteractive", "lazyVideoPlayBizCodeList", ""));
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if (!TextUtils.isEmpty(jSONArray.optString(i))) {
                        arrayList.add(jSONArray.optString(i));
                    }
                } catch (Throwable unused) {
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
