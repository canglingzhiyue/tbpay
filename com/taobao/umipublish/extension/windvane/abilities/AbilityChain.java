package com.taobao.umipublish.extension.windvane.abilities;

import android.content.Context;
import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.extension.windvane.abilities.BaseAbility;
import com.taobao.umipublish.monitor.PerformanceMonitor;
import tb.kge;

/* loaded from: classes9.dex */
public class AbilityChain extends BaseAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final BaseAbility f23326a;
    private AbilityChain b;
    private InputAndOutputHandler e;
    private boolean f;
    private String g;
    private String loadingText;
    private int c = 0;
    private float d = 1.0f;
    private boolean h = false;

    /* loaded from: classes9.dex */
    public static class InputAndOutputHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(197303117);
        }

        public JSONObject a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject}) : jSONObject;
        }

        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            }
        }

        public boolean c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{this, jSONObject})).booleanValue();
            }
            return false;
        }
    }

    static {
        kge.a(1704045685);
    }

    public static /* synthetic */ Object ipc$super(AbilityChain abilityChain, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(AbilityChain abilityChain, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24adf3bf", new Object[]{abilityChain, new Integer(i)});
        } else {
            abilityChain.a(i);
        }
    }

    public static /* synthetic */ boolean a(AbilityChain abilityChain, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24ae3394", new Object[]{abilityChain, new Boolean(z)})).booleanValue();
        }
        abilityChain.h = z;
        return z;
    }

    public static /* synthetic */ int b(AbilityChain abilityChain) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8461d856", new Object[]{abilityChain})).intValue() : abilityChain.c;
    }

    public static /* synthetic */ float c(AbilityChain abilityChain) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bd4238f2", new Object[]{abilityChain})).floatValue() : abilityChain.d;
    }

    public static /* synthetic */ boolean d(AbilityChain abilityChain) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f62299a5", new Object[]{abilityChain})).booleanValue() : abilityChain.f;
    }

    public static /* synthetic */ InputAndOutputHandler e(AbilityChain abilityChain) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputAndOutputHandler) ipChange.ipc$dispatch("b569ec44", new Object[]{abilityChain}) : abilityChain.e;
    }

    public static /* synthetic */ BaseAbility f(AbilityChain abilityChain) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseAbility) ipChange.ipc$dispatch("b2c5698b", new Object[]{abilityChain}) : abilityChain.f23326a;
    }

    public static /* synthetic */ AbilityChain g(AbilityChain abilityChain) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbilityChain) ipChange.ipc$dispatch("6cd1fdda", new Object[]{abilityChain}) : abilityChain.b;
    }

    public AbilityChain(BaseAbility baseAbility, Context context) {
        this.f23326a = baseAbility;
        this.f23326a.setContext(context);
        setContext(context);
    }

    public AbilityChain a(AbilityChain abilityChain) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityChain) ipChange.ipc$dispatch("8e0a8a20", new Object[]{this, abilityChain});
        }
        this.b = abilityChain;
        return abilityChain;
    }

    public AbilityChain a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityChain) ipChange.ipc$dispatch("d4dbfab4", new Object[]{this, new Float(f)});
        }
        this.d = f;
        return this;
    }

    public AbilityChain a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityChain) ipChange.ipc$dispatch("dd4ee8e", new Object[]{this, str});
        }
        this.g = str;
        return this;
    }

    public AbilityChain loadingText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityChain) ipChange.ipc$dispatch("1be03cb6", new Object[]{this, str});
        }
        this.loadingText = str;
        return this;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.g;
    }

    public AbilityChain a(InputAndOutputHandler inputAndOutputHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityChain) ipChange.ipc$dispatch("d522d988", new Object[]{this, inputAndOutputHandler});
        }
        this.e = inputAndOutputHandler;
        return this;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f = true;
        AbilityChain abilityChain = this.b;
        if (abilityChain == null) {
            return;
        }
        abilityChain.b();
    }

    public AbilityChain c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityChain) ipChange.ipc$dispatch("27a17dc6", new Object[]{this});
        }
        if (!this.h) {
            return this;
        }
        AbilityChain abilityChain = this.b;
        if (abilityChain == null) {
            return null;
        }
        return abilityChain.c();
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility
    public void onExecute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fd7073", new Object[]{this, jSONObject});
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f23326a.setListener(new BaseAbility.Listener() { // from class: com.taobao.umipublish.extension.windvane.abilities.AbilityChain.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                AbilityChain abilityChain = AbilityChain.this;
                abilityChain.progressCallback(AbilityChain.b(abilityChain) + ((int) (i * AbilityChain.c(AbilityChain.this))));
            }

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void a(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                    return;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                PerformanceMonitor.a().a("AbilityChain", "AbilityChain_" + AbilityChain.this.a(), elapsedRealtime2);
                if (AbilityChain.d(AbilityChain.this)) {
                    return;
                }
                if (AbilityChain.e(AbilityChain.this) != null) {
                    AbilityChain.e(AbilityChain.this).b(jSONObject2);
                }
                if (AbilityChain.e(AbilityChain.this) == null || !AbilityChain.e(AbilityChain.this).c(jSONObject2)) {
                    z = true;
                }
                if (!z) {
                    AbilityChain.this.errorCallback("ChainBreak_" + AbilityChain.this.a(), "ChainBreak_" + AbilityChain.f(AbilityChain.this).getClass().getSimpleName());
                    return;
                }
                AbilityChain.a(AbilityChain.this, true);
                if (AbilityChain.g(AbilityChain.this) != null) {
                    AbilityChain.g(AbilityChain.this).setListener(AbilityChain.this.mListener);
                    AbilityChain.a(AbilityChain.g(AbilityChain.this), (int) ((AbilityChain.c(AbilityChain.this) * 100.0f) + AbilityChain.b(AbilityChain.this)));
                    AbilityChain.g(AbilityChain.this).execute(jSONObject2);
                    return;
                }
                AbilityChain.this.successCallback(jSONObject2);
            }

            @Override // com.taobao.umipublish.extension.windvane.abilities.BaseAbility.Listener
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else {
                    AbilityChain.this.errorCallback(str, str2);
                }
            }
        });
        BaseAbility baseAbility = this.f23326a;
        InputAndOutputHandler inputAndOutputHandler = this.e;
        if (inputAndOutputHandler != null) {
            jSONObject = inputAndOutputHandler.a(jSONObject);
        }
        baseAbility.execute(jSONObject);
    }

    public String getLoadingText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ccfead86", new Object[]{this}) : this.loadingText;
    }
}
