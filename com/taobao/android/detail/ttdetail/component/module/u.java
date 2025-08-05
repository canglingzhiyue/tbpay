package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.am;
import java.util.List;
import tb.eyq;
import tb.eyx;
import tb.eze;
import tb.kge;
import tb.tac;

/* loaded from: classes4.dex */
public class u extends o<eze> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.detail.ttdetail.e f10564a;

    static {
        kge.a(-1890658158);
    }

    public static /* synthetic */ Object ipc$super(u uVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.e a(u uVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.e) ipChange.ipc$dispatch("8e83c51", new Object[]{uVar}) : uVar.f10564a;
    }

    public static /* synthetic */ String a(u uVar, List list, List list2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f919b6bc", new Object[]{uVar, list, list2}) : uVar.a(list, list2);
    }

    public u(Context context, eyx eyxVar, eze ezeVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, ezeVar, dataEntryArr);
        this.f10564a = new com.taobao.android.detail.ttdetail.e(context, eyxVar.e().a(), eyxVar);
        this.f10564a.a(new eyq.a() { // from class: com.taobao.android.detail.ttdetail.component.module.u.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.eyq.a
            public void a(h hVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b6a059af", new Object[]{this, hVar});
                } else {
                    u.this.mDetailContext.e().a(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH, com.taobao.android.detail.ttdetail.utils.k.a((String) u.this.mDetailContext.e().a(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH), com.taobao.android.detail.ttdetail.utils.a.a(hVar)));
                }
            }
        });
        this.mDetailContext.e().a(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH, new tac() { // from class: com.taobao.android.detail.ttdetail.component.module.u.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.tac
            public void a(Object obj, Object obj2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("184a7920", new Object[]{this, obj, obj2});
                    return;
                }
                List a2 = obj2 != null ? am.a(obj2.toString().split(";")) : null;
                u uVar = u.this;
                u.a(u.this).b(u.a(uVar, a2, u.a(uVar).c()));
            }
        });
        this.mDetailContext.e().a(com.taobao.android.detail.core.aura.observer.d.KEY_PRICE_MODEL, new tac() { // from class: com.taobao.android.detail.ttdetail.component.module.u.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.tac
            public void a(Object obj, Object obj2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("184a7920", new Object[]{this, obj, obj2});
                } else {
                    u.a(u.this).c(obj2 != null ? obj2.toString() : null);
                }
            }
        });
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.f10564a.a(viewGroup);
        }
    }

    public void b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3684528", new Object[]{this, viewGroup});
        } else {
            this.f10564a.b(viewGroup);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f10564a.a(z);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.f10564a.b(z);
        }
    }

    private String a(List<String> list, List<h> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3119ed96", new Object[]{this, list, list2});
        }
        if (list != null && list2 != null) {
            for (String str : list) {
                for (h hVar : list2) {
                    if (TextUtils.equals(str, com.taobao.android.detail.ttdetail.utils.a.a(hVar))) {
                        return str;
                    }
                }
            }
        }
        return null;
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.f10564a.a(f);
        }
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            this.f10564a.b(f);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.f10564a.a(i);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        this.f10564a.d();
        return this.f10564a.e();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.o, com.taobao.android.detail.ttdetail.component.module.d
    public <C extends d> C findComponent(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C) ipChange.ipc$dispatch("2d63d1e0", new Object[]{this, str}) : (C) this.f10564a.a(str);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.o, com.taobao.android.detail.ttdetail.component.module.d
    public <C extends d> C findComponentByUltronName(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C) ipChange.ipc$dispatch("2c508b56", new Object[]{this, str}) : (C) this.f10564a.d(str);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.f10564a.b();
        super.onDestroy();
    }
}
