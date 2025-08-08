package com.taobao.umipublish.extension.windvane.abilities;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.workflow.e;
import com.taobao.android.litecreator.sdk.framework.container.loading.c;
import com.taobao.android.litecreator.sdk.framework.container.loading.d;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.litecreator.util.m;
import com.taobao.android.litecreator.util.u;
import com.taobao.taobao.R;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import java.util.UUID;
import tb.ios;
import tb.kge;

/* loaded from: classes9.dex */
public class QuickBaseAbility extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "QuickPublishAbility";

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f23339a;
    public JSONObject b;
    public AbilityChain c;
    public final BaseAbility.Listener d = new BaseAbility.Listener() { // from class: com.taobao.umipublish.extension.windvane.abilities.QuickBaseAbility.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
        public void a(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            if (i <= QuickBaseAbility.a(QuickBaseAbility.this)) {
                i = QuickBaseAbility.a(QuickBaseAbility.this);
            }
            au.a(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.abilities.QuickBaseAbility.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    QuickBaseAbility.this.a(i);
                    AbilityChain c = QuickBaseAbility.this.c.c();
                    if (c == null) {
                        return;
                    }
                    QuickBaseAbility.this.a(StringUtils.isEmpty(c.getLoadingText()) ? b.a(R.string.gg_pub_loading_1) : c.getLoadingText());
                }
            });
            QuickBaseAbility.this.progressCallback(i);
            QuickBaseAbility.a(QuickBaseAbility.this, i);
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            u.b(QuickBaseAbility.TAG, "onSuccess");
            QuickBaseAbility.this.b();
            QuickBaseAbility.this.successCallback(jSONObject);
        }

        @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            u.d(QuickBaseAbility.TAG, "onFailed. errCode=" + str + ", errMsg=" + str2);
            QuickBaseAbility.this.b();
            QuickBaseAbility.this.errorCallback(str, str2);
        }
    };
    public c e;
    private int f;

    static {
        kge.a(357689002);
    }

    public static /* synthetic */ int a(QuickBaseAbility quickBaseAbility) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9b81e4e2", new Object[]{quickBaseAbility})).intValue() : quickBaseAbility.f;
    }

    public static /* synthetic */ int a(QuickBaseAbility quickBaseAbility, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4bb2be7", new Object[]{quickBaseAbility, new Integer(i)})).intValue();
        }
        quickBaseAbility.f = i;
        return i;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (jSONObject == null) {
                errorCallback("1", "input params is null ");
                return;
            }
            this.f23339a = jSONObject.getJSONObject("data");
            this.b = a(jSONObject);
            if (this.b == null) {
                errorCallback("2", "mUrlParams is null ");
                return;
            }
            if (!this.b.containsKey("umi_pub_session")) {
                this.b.put("umi_pub_session", (Object) UUID.randomUUID().toString());
            }
            JSONObject b = m.b(this.f23339a, MspGlobalDefine.EXTENDINFO);
            JSONObject jSONObject2 = this.b;
            if (b == null) {
                b = new JSONObject();
            }
            jSONObject2.putAll(b);
        } catch (Throwable th) {
            errorCallback("-1", Log.getStackTraceString(th));
        }
    }

    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject b = m.b(jSONObject, "publishParams");
        if (!e.k(this.mContext)) {
            return b;
        }
        String c = e.c(this.mContext);
        if (StringUtils.isEmpty(c)) {
            return null;
        }
        JSONObject jSONObject2 = (JSONObject) JSON.toJSON(ios.a(c).a());
        if (b != null) {
            jSONObject2.putAll(b);
        }
        return jSONObject2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.e == null) {
            this.e = new c(this.mContext, null);
        }
        this.e.b(b.a(R.string.gg_pub_loading_1));
        this.e.a(b.a(R.string.gg_pub_keep_screen_on_do_not_switch_app));
        this.e.a(true);
        this.e.setCancelable(false);
        this.e.b(true);
        this.e.show();
        c cVar = this.e;
        cVar.a(new d(cVar) { // from class: com.taobao.umipublish.extension.windvane.abilities.QuickBaseAbility.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == 92838762) {
                    super.c();
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // com.taobao.android.litecreator.sdk.framework.container.loading.d, com.taobao.android.litecreator.sdk.framework.container.loading.a
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                super.c();
                QuickBaseAbility.this.c.b();
                QuickBaseAbility.this.d.a("-2", com.alibaba.ability.impl.photo.b.ERROR_CODE_USER_CANCELED);
            }
        });
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.dismiss();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.a(i);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.b(str);
    }
}
