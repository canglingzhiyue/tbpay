package com.taobao.global.setting.megability;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsGeneralSettingAbility;
import com.taobao.android.abilityidl.ability.GeneralSettingOnChangeData;
import com.taobao.android.abilityidl.ability.aw;
import com.taobao.android.abilityidl.ability.bv;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import tb.als;
import tb.ksx;
import tb.ssj;
import tb.ssl;

/* loaded from: classes7.dex */
public class GeneralSettingAbility extends AbsGeneralSettingAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ksx f17216a = new ksx(Globals.getApplication());
    private final Map<String, ssj> b = new HashMap();

    public static /* synthetic */ Object ipc$super(GeneralSettingAbility generalSettingAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    @Override // com.taobao.android.abilityidl.ability.AbsGeneralSettingAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ability.result.g<java.lang.String, com.alibaba.ability.result.ErrorResult> get(tb.als r5, com.taobao.android.abilityidl.ability.aw r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.global.setting.megability.GeneralSettingAbility.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r2 = 1
            r1[r2] = r5
            r5 = 2
            r1[r5] = r6
            java.lang.String r5 = "971ad346"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            com.alibaba.ability.result.g r5 = (com.alibaba.ability.result.g) r5
            return r5
        L1b:
            java.lang.String r0 = "url"
            java.lang.Object r0 = r5.c(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L48
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L48
            r1.<init>(r0)     // Catch: java.lang.Exception -> L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L48
            r0.<init>()     // Catch: java.lang.Exception -> L48
            java.lang.String r3 = r1.getHost()     // Catch: java.lang.Exception -> L48
            r0.append(r3)     // Catch: java.lang.Exception -> L48
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Exception -> L48
            r0.append(r1)     // Catch: java.lang.Exception -> L48
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L48
            goto L49
        L48:
            r0 = r2
        L49:
            boolean r1 = android.text.StringUtils.isEmpty(r0)
            if (r1 == 0) goto L5d
            tb.alt r1 = r5.b()
            if (r1 == 0) goto L5d
            tb.alt r5 = r5.b()
            java.lang.String r0 = r5.d()
        L5d:
            boolean r5 = android.text.StringUtils.isEmpty(r0)
            java.lang.String r1 = "mtbSettings"
            if (r5 == 0) goto L7a
            java.lang.String r5 = "GeneralSettingAbility user data url is null and env.getBusinessID is null"
            com.taobao.tao.log.TLog.loge(r1, r5)
            com.alibaba.ability.result.g r5 = new com.alibaba.ability.result.g
            com.alibaba.ability.result.ErrorResult r6 = new com.alibaba.ability.result.ErrorResult
            java.lang.String r0 = "500"
            java.lang.String r1 = "user data url is null and env.getBusinessID is null"
            r6.<init>(r0, r1)
            r5.<init>(r2, r6)
            return r5
        L7a:
            java.lang.String r5 = r6.f8794a
            java.lang.String r3 = "tbGlobalMuteSetting"
            boolean r5 = android.text.StringUtils.equals(r5, r3)
            if (r5 == 0) goto Lb5
            tb.ksx r5 = r4.f17216a
            java.lang.String r0 = r6.f8794a
            boolean r5 = r5.a(r0)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "GeneralSettingAbility key="
            r0.append(r2)
            java.lang.String r6 = r6.f8794a
            r0.append(r6)
            java.lang.String r6 = " result="
            r0.append(r6)
            r0.append(r5)
            java.lang.String r6 = r0.toString()
            com.taobao.tao.log.TLog.loge(r1, r6)
            com.alibaba.ability.result.g r6 = new com.alibaba.ability.result.g
            r6.<init>(r5)
            return r6
        Lb5:
            tb.ksx r5 = r4.f17216a     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = r6.f8794a     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r2 = r5.b(r0, r1)     // Catch: java.lang.Throwable -> Lbe
            goto Lc2
        Lbe:
            r5 = move-exception
            r5.printStackTrace()
        Lc2:
            com.alibaba.ability.result.g r5 = new com.alibaba.ability.result.g
            if (r2 != 0) goto Lcd
            java.lang.String r6 = r6.f8794a
            java.lang.String r6 = r4.b(r6)
            goto Ld1
        Lcd:
            java.lang.String r6 = r2.toString()
        Ld1:
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.global.setting.megability.GeneralSettingAbility.get(tb.als, com.taobao.android.abilityidl.ability.aw):com.alibaba.ability.result.g");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsGeneralSettingAbility
    public void setChangeListener(als alsVar, aw awVar, final bv bvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ae9575", new Object[]{this, alsVar, awVar, bvVar});
            return;
        }
        a(awVar.f8794a);
        ssj ssjVar = new ssj() { // from class: com.taobao.global.setting.megability.GeneralSettingAbility.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ssj
            public void a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                } else if (obj == null) {
                } else {
                    GeneralSettingOnChangeData generalSettingOnChangeData = new GeneralSettingOnChangeData();
                    generalSettingOnChangeData.value = obj.toString();
                    bvVar.a(generalSettingOnChangeData);
                }
            }
        };
        synchronized (this) {
            this.b.put(awVar.f8794a, ssjVar);
        }
        ssl.a(awVar.f8794a, ssjVar);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsGeneralSettingAbility
    public g<Object, ErrorResult> unsetChangeListener(als alsVar, aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("f908412f", new Object[]{this, alsVar, awVar});
        }
        a(awVar.f8794a);
        return new g<>();
    }

    @Override // com.taobao.android.abilityidl.b, com.taobao.android.abilityidl.c
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        synchronized (this) {
            for (Map.Entry<String, ssj> entry : this.b.entrySet()) {
                ssl.b(entry.getKey(), entry.getValue());
            }
            this.b.clear();
        }
    }

    private synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (this.b.containsKey(str)) {
            ssl.b(str, this.b.get(str));
            this.b.remove(str);
        }
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1318257740) {
            if (hashCode != 3363353) {
                if (hashCode == 1417486629 && str.equals("liveMute")) {
                    c = 1;
                }
            } else if (str.equals("mute")) {
                c = 0;
            }
        } else if (str.equals("inTimeFrameMute")) {
            c = 2;
        }
        return (c == 0 || c == 1 || c == 2) ? "false" : "";
    }
}
