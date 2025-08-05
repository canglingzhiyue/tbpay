package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.bindingx.core.c;
import com.alibaba.android.bindingx.core.d;
import com.alibaba.android.bindingx.core.e;
import com.alibaba.android.bindingx.core.h;
import com.alibaba.android.bindingx.core.i;
import com.alibaba.android.bindingx.core.internal.w;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class bbq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f25754a;

    /* loaded from: classes.dex */
    public static class a implements i.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private bbs f25760a;

        public a(bbs bbsVar) {
            this.f25760a = bbsVar;
        }

        @Override // com.alibaba.android.bindingx.core.i.d
        public View a(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("c8786441", new Object[]{this, str, objArr});
            }
            if (objArr != null && objArr.length > 0 && (objArr[0] instanceof View)) {
                return this.f25760a.a((View) objArr[0], str);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements i.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private bbp f25761a;

        public b(bbp bbpVar) {
            this.f25761a = bbpVar;
        }

        @Override // com.alibaba.android.bindingx.core.i.e
        public void a(View view, String str, Object obj, i.b bVar, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb2be52b", new Object[]{this, view, str, obj, bVar, map, objArr});
                return;
            }
            bbp bbpVar = this.f25761a;
            if (bbpVar == null) {
                return;
            }
            bbpVar.a(view, str, obj, bVar, map);
        }
    }

    public static bbq a(bbs bbsVar, i.b bVar, bbp bbpVar, i.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbq) ipChange.ipc$dispatch("e75597b1", new Object[]{bbsVar, bVar, bbpVar, cVar}) : new bbq(bbsVar, bVar, bbpVar, cVar);
    }

    private bbq(bbs bbsVar, i.b bVar, bbp bbpVar, i.c cVar) {
        i.e bVar2;
        c.a("dx", null);
        bbsVar = bbsVar == null ? new bbs() { // from class: tb.bbq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bbs
            public View a(View view, String str) {
                int identifier;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (View) ipChange.ipc$dispatch("52a699f6", new Object[]{this, view, str});
                }
                if (view != null && !TextUtils.isEmpty(str)) {
                    try {
                        identifier = Integer.parseInt(str);
                    } catch (Throwable unused) {
                        Context context = view.getContext();
                        identifier = context.getResources().getIdentifier(str, "id", context.getPackageName());
                    }
                    if (identifier > 0) {
                        return view.findViewById(identifier);
                    }
                }
                return null;
            }
        } : bbsVar;
        bVar = bVar == null ? new i.b() { // from class: tb.bbq.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.i.b
            public double a(double d, Object... objArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("91a5be89", new Object[]{this, new Double(d), objArr})).doubleValue() : d;
            }

            @Override // com.alibaba.android.bindingx.core.i.b
            public double b(double d, Object... objArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("15d60b8a", new Object[]{this, new Double(d), objArr})).doubleValue() : d;
            }
        } : bVar;
        if (bbpVar == null) {
            bVar2 = new i.e() { // from class: tb.bbq.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.bindingx.core.i.e
                public void a(View view, String str, Object obj, i.b bVar3, Map<String, Object> map, Object... objArr) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("fb2be52b", new Object[]{this, view, str, obj, bVar3, map, objArr});
                    } else {
                        bbt.a(str).a(view, str, obj, bVar3, map);
                    }
                }
            };
        } else {
            bVar2 = new b(bbpVar);
        }
        this.f25754a = new d(a(new a(bbsVar), bVar, bVar2, cVar));
        this.f25754a.a("scroll", new d.b<e, Context, i>() { // from class: tb.bbq.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.d.b
            public e a(Context context, i iVar, Object... objArr) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("400a90e5", new Object[]{this, context, iVar, objArr}) : new bbo(context, iVar, objArr);
            }
        });
    }

    public Map<String, Object> a(View view, Map<String, Object> map, final bbr bbrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a680b74e", new Object[]{this, view, map, bbrVar});
        }
        if (view == null) {
            h.d("params invalid. view is null");
            return Collections.emptyMap();
        }
        if (map == null) {
            map = Collections.emptyMap();
        }
        String a2 = this.f25754a.a(view.getContext(), null, map, new d.a() { // from class: tb.bbq.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.bindingx.core.d.a
            public void a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                    return;
                }
                bbr bbrVar2 = bbrVar;
                if (bbrVar2 == null || !(obj instanceof Map)) {
                    return;
                }
                bbrVar2.a((Map) obj);
            }
        }, view);
        HashMap hashMap = new HashMap(2);
        hashMap.put("token", a2);
        hashMap.put("eventType", w.a(map, "eventType"));
        return hashMap;
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        d dVar = this.f25754a;
        if (dVar == null) {
            return;
        }
        dVar.a(map);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        d dVar = this.f25754a;
        if (dVar == null) {
            return;
        }
        dVar.a();
        this.f25754a = null;
        bbt.a();
    }

    private i a(i.d dVar, i.b bVar, i.e eVar, i.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("723197e9", new Object[]{this, dVar, bVar, eVar, cVar}) : new i.a().a(dVar).a(bVar).a(eVar).a(cVar).a();
    }
}
