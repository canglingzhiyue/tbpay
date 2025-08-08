package com.taobao.family;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.login4android.api.Login;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.riu;

/* loaded from: classes7.dex */
public class FamilyAccsService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Handler f17122a = new Handler();

    public static /* synthetic */ Object ipc$super(FamilyAccsService familyAccsService, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListener
    public void onAntiBrush(boolean z, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec7a087d", new Object[]{this, new Boolean(z), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListener
    public void onConnected(TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df10c6", new Object[]{this, connectInfo});
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListener
    public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46188f6", new Object[]{this, connectInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    public static /* synthetic */ void a(FamilyAccsService familyAccsService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeb3585c", new Object[]{familyAccsService, str});
        } else {
            familyAccsService.a(str);
        }
    }

    public static /* synthetic */ void a(FamilyAccsService familyAccsService, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58da326", new Object[]{familyAccsService, str, str2});
        } else {
            familyAccsService.a(str, str2);
        }
    }

    public static /* synthetic */ boolean a(FamilyAccsService familyAccsService, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb5a45b2", new Object[]{familyAccsService, activity, str})).booleanValue() : familyAccsService.a(activity, str);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        String str4;
        int optInt;
        final JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            return;
        }
        JSONObject jSONObject = null;
        try {
            str4 = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            str4 = null;
        }
        if (StringUtils.isEmpty(str4)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("userId", str2);
        hashMap.put("data", str4);
        hashMap.put("dataId", str3);
        k.a(k.ARG1_RECEIVE_ACCS, hashMap);
        String str5 = "receive accs: userId: " + str2 + " data: " + str4;
        try {
            jSONObject = new JSONObject(str4);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (jSONObject == null || (optInt = jSONObject.optInt("type", 0)) == 0) {
            return;
        }
        if (optInt == 1) {
            a(jSONObject);
        } else if (optInt == 4) {
            FamilyManager.sendGetFamilyRelationRequest();
        } else if (optInt == 2 || optInt == 3) {
            FamilyManager.sendGetFamilyRelationRequest();
            if (optInt != 2) {
                return;
            }
            this.f17122a.postDelayed(new Runnable() { // from class: com.taobao.family.FamilyAccsService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FamilyAccsService.this.sendBroadcast(new Intent("com.taobao.social.family.add"));
                    }
                }
            }, 1000L);
        } else if (optInt != 5 || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
        } else {
            this.f17122a.postDelayed(new Runnable() { // from class: com.taobao.family.FamilyAccsService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FamilyAccsService.a(FamilyAccsService.this, optJSONObject.optString("popEvent"), optJSONObject.optString("param"));
                    }
                }
            }, 3000L);
        }
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f17122a.postDelayed(new Runnable() { // from class: com.taobao.family.FamilyAccsService.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!FamilyAccsService.a(FamilyAccsService.this, com.taobao.application.common.c.b(), str)) {
                    } else {
                        FamilyAccsService familyAccsService = FamilyAccsService.this;
                        FamilyAccsService.a(familyAccsService, "poplayer://socialqinqinghao", "token=" + str);
                    }
                }
            }, 3000L);
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null) {
            return;
        }
        final String optString = optJSONObject.optString("token");
        if (StringUtils.isEmpty(optString)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("token", optString);
        e.f17131a.a(e.API_NAME_ACCS_CHECK, hashMap, new i() { // from class: com.taobao.family.FamilyAccsService.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.family.i
            public void b(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("345f6975", new Object[]{this, jSONObject2});
                }
            }

            @Override // com.taobao.family.i
            public void a(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject2});
                } else if (jSONObject2 == null) {
                } else {
                    if (jSONObject2.optInt("isPop") == 1) {
                        z = true;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("token", optString);
                    hashMap2.put("userId", Login.getUserId());
                    hashMap2.put("display", String.valueOf(z));
                    k.a(k.ARG1_ACCS_CHECK, hashMap2);
                    String str = "accs check, userId: " + Login.getUserId() + " token: " + optString + " display: " + z;
                    if (!z) {
                        return;
                    }
                    FamilyAccsService.a(FamilyAccsService.this, optString);
                }
            }
        });
    }

    private boolean a(Activity activity, String str) {
        Intent intent;
        Map<String, String> b;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8bb1508", new Object[]{this, activity, str})).booleanValue();
        }
        if (activity == null || activity.getClass() == null || (intent = activity.getIntent()) == null) {
            return true;
        }
        String str3 = null;
        if (activity.getClass().getSimpleName().equals("BrowserActivity")) {
            str3 = intent.getDataString();
            if (StringUtils.isEmpty(str3)) {
                try {
                    str3 = intent.getStringExtra("myBrowserUrl");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (activity.getClass().getSimpleName().equals("WXActivity")) {
            str3 = intent.getStringExtra(riu.e);
        }
        return StringUtils.isEmpty(str3) || (b = b(str3)) == null || b.size() == 0 || (str2 = b.get("token")) == null || !str2.equals(str);
    }

    private Map<String, String> b(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (StringUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            String[] split = new URL(str).getQuery().split("&");
            if (split != null) {
                for (String str3 : split) {
                    int indexOf = str3.indexOf(61);
                    String str4 = null;
                    if (indexOf > 0) {
                        str4 = str3.substring(0, indexOf);
                        str2 = str3.substring(indexOf + 1);
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        hashMap.put(str4, str2);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
            intent.putExtra("event", str);
            if (!StringUtils.isEmpty(str2)) {
                intent.putExtra("param", str2);
            }
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
            HashMap hashMap = new HashMap();
            hashMap.put("event", str);
            hashMap.put("param", str2);
            k.a(k.ARG1_POST_POPLAYER, hashMap);
        }
    }
}
