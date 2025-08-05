package com.taobao.zcache;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class u implements i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final u instance;

    /* renamed from: a  reason: collision with root package name */
    public boolean f23660a = true;

    static {
        kge.a(-1232442055);
        kge.a(1328557054);
        instance = new u();
    }

    @Override // com.taobao.zcache.i
    public void a(String str, final m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eff16b16", new Object[]{this, str, mVar});
        } else if (str == null || mVar == null) {
        } else {
            final String replace = str.replace('.', '_');
            try {
                OrangeConfig.getInstance().registerListener(new String[]{replace}, new com.taobao.orange.d() { // from class: com.taobao.zcache.u.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.orange.d
                    public void onConfigUpdate(String str2, Map<String, String> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str2, map});
                        } else if (!replace.equals(str2) || !u.this.f23660a) {
                        } else {
                            String customConfig = OrangeConfig.getInstance().getCustomConfig(replace, "{}");
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(customConfig);
                            mVar.a(arrayList);
                        }
                    }
                }, true);
            } catch (NoClassDefFoundError unused) {
            }
        }
    }
}
