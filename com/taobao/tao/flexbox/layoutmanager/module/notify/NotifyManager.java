package com.taobao.tao.flexbox.layoutmanager.module.notify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.ability.impl.user.UserAbility;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.p;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.tmall.android.dai.DAI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.oeb;

/* loaded from: classes8.dex */
public class NotifyManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static HashMap<String, b> g;
    private static HashMap<String, Class<? extends com.taobao.tao.flexbox.layoutmanager.module.notify.a>> i;

    /* renamed from: a  reason: collision with root package name */
    private NormalNotifyImpl f20448a = new NormalNotifyImpl();
    private f b = new f();
    private a c = new a();
    private DAINotifyImpl d = new DAINotifyImpl();
    private i e = new i();
    private e f = new e();
    private Map<String, com.taobao.tao.flexbox.layoutmanager.module.notify.a> h = new HashMap();

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f20455a;
        public d b;

        static {
            kge.a(-283641484);
        }
    }

    /* loaded from: classes8.dex */
    public interface d {
        JSONObject a(JSONObject jSONObject);
    }

    /* loaded from: classes8.dex */
    public interface g {
        void a();
    }

    /* loaded from: classes8.dex */
    public interface h {
        void a(JSONObject jSONObject);
    }

    public static /* synthetic */ HashMap b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[0]) : g;
    }

    static {
        kge.a(-2130878312);
        g = new HashMap<>();
        i = new HashMap<>();
    }

    public static void a(String str, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e727453", new Object[]{str, str2, dVar});
            return;
        }
        b bVar = new b();
        bVar.f20455a = str2;
        bVar.b = dVar;
        g.put(str, bVar);
    }

    public static void a(String str, Class<? extends com.taobao.tao.flexbox.layoutmanager.module.notify.a> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{str, cls});
        } else {
            i.put(str, cls);
        }
    }

    public void a(String str, g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed70b58d", new Object[]{this, str, cVar});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 94195219) {
            if (hashCode != 301118016) {
                if (hashCode == 729296864 && str.equals("TNodeApplicationStateNotify")) {
                    c = 1;
                }
            } else if (str.equals("TBTabbarStyleChangeNotification")) {
                c = 2;
            }
        } else if (str.equals("TNodeUserChanged")) {
            c = 0;
        }
        if (c == 0) {
            this.b.a(str, cVar);
        } else if (c == 1) {
            this.c.a(str, cVar);
        } else if (c == 2) {
            this.f.a(str, cVar);
        } else {
            com.taobao.tao.flexbox.layoutmanager.module.notify.a a2 = a(str, true);
            if (a2 != null) {
                a2.a(str, cVar);
            } else if (str.startsWith("DAI_")) {
                this.d.a(str, cVar);
            } else {
                b bVar = g.get(str);
                this.f20448a.a(bVar == null ? str : bVar.f20455a, cVar);
                this.e.a(str, cVar);
            }
        }
    }

    public void b(String str, g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89deb1ec", new Object[]{this, str, cVar});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 94195219) {
            if (hashCode != 301118016) {
                if (hashCode == 729296864 && str.equals("TNodeApplicationStateNotify")) {
                    c = 1;
                }
            } else if (str.equals("TBTabbarStyleChangeNotification")) {
                c = 2;
            }
        } else if (str.equals("TNodeUserChanged")) {
            c = 0;
        }
        if (c == 0) {
            f fVar = this.b;
            if (fVar == null) {
                return;
            }
            fVar.b(str, cVar);
        } else if (c == 1) {
            a aVar = this.c;
            if (aVar == null) {
                return;
            }
            aVar.b(str, cVar);
        } else if (c == 2) {
            e eVar = this.f;
            if (eVar == null) {
                return;
            }
            eVar.b(str, cVar);
        } else {
            com.taobao.tao.flexbox.layoutmanager.module.notify.a a2 = a(str, false);
            if (a2 != null) {
                a2.b(str, cVar);
            } else if (str.startsWith("DAI_")) {
                DAINotifyImpl dAINotifyImpl = this.d;
                if (dAINotifyImpl == null) {
                    return;
                }
                dAINotifyImpl.b(str, cVar);
            } else {
                b bVar = g.get(str);
                String str2 = bVar == null ? str : bVar.f20455a;
                NormalNotifyImpl normalNotifyImpl = this.f20448a;
                if (normalNotifyImpl != null) {
                    normalNotifyImpl.b(str2, cVar);
                }
                i iVar = this.e;
                if (iVar == null) {
                    return;
                }
                iVar.b(str, cVar);
            }
        }
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else {
            LocalBroadcastManager.getInstance(ab.a()).sendBroadcast(intent);
        }
    }

    private com.taobao.tao.flexbox.layoutmanager.module.notify.a a(String str, boolean z) {
        Class<? extends com.taobao.tao.flexbox.layoutmanager.module.notify.a> cls;
        com.taobao.tao.flexbox.layoutmanager.module.notify.a newInstance;
        com.taobao.tao.flexbox.layoutmanager.module.notify.a aVar = this.h.get(str);
        if (aVar != null || (cls = i.get(str)) == null || !z) {
            return aVar;
        }
        try {
            newInstance = cls.newInstance();
        } catch (IllegalAccessException e2) {
            e = e2;
        } catch (InstantiationException e3) {
            e = e3;
        }
        try {
            this.h.put(str, newInstance);
            return newInstance;
        } catch (IllegalAccessException e4) {
            e = e4;
            aVar = newInstance;
            e.printStackTrace();
            return aVar;
        } catch (InstantiationException e5) {
            e = e5;
            aVar = newInstance;
            e.printStackTrace();
            return aVar;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Collection<com.taobao.tao.flexbox.layoutmanager.module.notify.a> values = this.h.values();
        for (com.taobao.tao.flexbox.layoutmanager.module.notify.a aVar : values) {
            aVar.a();
        }
        values.clear();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.a();
        this.f20448a.a();
        this.c.a();
        this.d.a();
        this.e.a();
        this.f.a();
        c();
        this.f20448a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    /* loaded from: classes8.dex */
    public class NormalNotifyImpl extends com.taobao.tao.flexbox.layoutmanager.module.notify.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private HashMap<String, NormalBroadcastReceiver> d = new HashMap<>();

        static {
            kge.a(2067457020);
        }

        public static /* synthetic */ Object ipc$super(NormalNotifyImpl normalNotifyImpl, String str, Object... objArr) {
            if (str.hashCode() == 90991720) {
                super.a();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public NormalNotifyImpl() {
        }

        /* loaded from: classes8.dex */
        public class NormalBroadcastReceiver extends BroadcastReceiver {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private List<g.c> b = new ArrayList();

            static {
                kge.a(1889178337);
            }

            public NormalBroadcastReceiver() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null) {
                    Bundle extras = intent.getExtras();
                    JSONObject jSONObject = null;
                    if (extras != null) {
                        Set<String> keySet = extras.keySet();
                        JSONObject jSONObject2 = new JSONObject();
                        boolean S = oeb.S();
                        for (String str : keySet) {
                            Object obj = extras.get(str);
                            if (S) {
                                jSONObject2.put(str, obj);
                            } else {
                                jSONObject2.put(str, (Object) (obj == null ? null : obj.toString()));
                            }
                        }
                        jSONObject = jSONObject2;
                    }
                    String action = intent.getAction();
                    for (b bVar : NotifyManager.b().values()) {
                        if (TextUtils.equals(bVar.f20455a, action) && bVar.b != null) {
                            jSONObject = bVar.b.a(jSONObject);
                        }
                    }
                    for (g.c cVar : this.b) {
                        cVar.c.a(cVar, jSONObject);
                    }
                }
            }

            public void a(g.c cVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("16567517", new Object[]{this, cVar});
                } else {
                    this.b.add(cVar);
                }
            }

            public void b(g.c cVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8001b36", new Object[]{this, cVar});
                    return;
                }
                Iterator<g.c> it = this.b.iterator();
                while (it.hasNext()) {
                    if (com.taobao.tao.flexbox.layoutmanager.module.notify.a.a(cVar, it.next())) {
                        it.remove();
                    }
                }
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void a(String str, g.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed70b58d", new Object[]{this, str, cVar});
                return;
            }
            NormalBroadcastReceiver normalBroadcastReceiver = this.d.get(str);
            if (normalBroadcastReceiver == null) {
                normalBroadcastReceiver = new NormalBroadcastReceiver();
                this.d.put(str, normalBroadcastReceiver);
                IntentFilter intentFilter = new IntentFilter(str);
                ab.a().registerReceiver(normalBroadcastReceiver, intentFilter);
                LocalBroadcastManager.getInstance(ab.a()).registerReceiver(normalBroadcastReceiver, intentFilter);
            }
            normalBroadcastReceiver.a(cVar);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void b(String str, g.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89deb1ec", new Object[]{this, str, cVar});
                return;
            }
            NormalBroadcastReceiver normalBroadcastReceiver = this.d.get(str);
            if (normalBroadcastReceiver == null) {
                return;
            }
            normalBroadcastReceiver.b(cVar);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            super.a();
            Collection<NormalBroadcastReceiver> values = this.d.values();
            if (values != null) {
                for (NormalBroadcastReceiver normalBroadcastReceiver : values) {
                    ab.a().unregisterReceiver(normalBroadcastReceiver);
                    LocalBroadcastManager.getInstance(ab.a()).unregisterReceiver(normalBroadcastReceiver);
                }
            }
            this.d.clear();
        }
    }

    /* loaded from: classes8.dex */
    public class f extends com.taobao.tao.flexbox.layoutmanager.module.notify.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean b;
        private ILogin.a c;
        private ILogin.LoginCallback d;

        static {
            kge.a(1304062939);
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -311380595) {
                super.a((String) objArr[0], (g.c) objArr[1]);
                return null;
            } else if (hashCode != 90991720) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.a();
                return null;
            }
        }

        public f() {
        }

        public static /* synthetic */ boolean a(f fVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2498601", new Object[]{fVar})).booleanValue() : fVar.d();
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            ILogin g = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().g();
            this.b = g.b();
            this.c = g.a();
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void a(String str, g.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed70b58d", new Object[]{this, str, cVar});
                return;
            }
            super.a(str, cVar);
            final ILogin g = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().g();
            if (this.d != null) {
                return;
            }
            c();
            this.d = new ILogin.LoginCallback() { // from class: com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin.LoginCallback
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        return;
                    }
                    Map jSONObject = new JSONObject();
                    Set<String> b = f.this.b();
                    if (i != 1) {
                        if ((i != 2 && i != 3) || !f.a(f.this)) {
                            return;
                        }
                        jSONObject.put(UserAbility.API_IS_LOGIN, (Object) false);
                        for (String str2 : b) {
                            f.this.a(str2, jSONObject);
                        }
                        return;
                    }
                    ILogin.a a2 = g.a();
                    if (!f.a(f.this)) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("uId", (Object) a2.f19967a);
                    jSONObject2.put("nick", (Object) a2.b);
                    jSONObject2.put("userLogo", (Object) a2.c);
                    jSONObject.put("user", (Object) jSONObject2);
                    jSONObject.put(UserAbility.API_IS_LOGIN, (Object) true);
                    for (String str3 : b) {
                        f.this.a(str3, jSONObject);
                    }
                }
            };
            g.a(this.d);
        }

        private boolean d() {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
            }
            boolean b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().g().b();
            ILogin.a a2 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().g().a();
            if (this.b == b && ILogin.a.a(this.c, a2) && !oeb.a("disableFilterDupLoginState", false)) {
                z = false;
            }
            if (z) {
                this.b = b;
                this.c = a2;
            }
            return z;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            super.a();
            if (this.d == null) {
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().g().b(this.d);
            this.d = null;
        }
    }

    /* loaded from: classes8.dex */
    public class a extends com.taobao.tao.flexbox.layoutmanager.module.notify.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private a.InterfaceC0836a d;
        private boolean e = true;

        static {
            kge.a(653391024);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -311380595) {
                super.a((String) objArr[0], (g.c) objArr[1]);
                return null;
            } else if (hashCode != 90991720) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.a();
                return null;
            }
        }

        public a() {
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2474026", new Object[]{aVar})).booleanValue() : aVar.e;
        }

        public static /* synthetic */ boolean a(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a6a176f6", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.e = z;
            return z;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void a(String str, g.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed70b58d", new Object[]{this, str, cVar});
                return;
            }
            super.a(str, cVar);
            if (this.d != null) {
                return;
            }
            this.d = new a.InterfaceC0836a() { // from class: com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a.InterfaceC0836a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (a.a(a.this)) {
                        a.a(a.this, false);
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("state", (Object) "active");
                        for (String str2 : a.this.b()) {
                            a.this.a(str2, jSONObject);
                        }
                    }
                }

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a.InterfaceC0836a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("state", (Object) "background");
                    for (String str2 : a.this.b()) {
                        a.this.a(str2, jSONObject);
                    }
                }
            };
            if (com.taobao.tao.flexbox.layoutmanager.adapter.a.a().n() == null) {
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().n().a(this.d);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            super.a();
            if (com.taobao.tao.flexbox.layoutmanager.adapter.a.a().n() == null) {
                return;
            }
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().n().b(this.d);
        }
    }

    /* loaded from: classes8.dex */
    public class DAINotifyImpl extends com.taobao.tao.flexbox.layoutmanager.module.notify.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private HashMap<String, DAIBroadcastReceiver> d = new HashMap<>();

        static {
            kge.a(-586547575);
        }

        public static /* synthetic */ Object ipc$super(DAINotifyImpl dAINotifyImpl, String str, Object... objArr) {
            if (str.hashCode() == 90991720) {
                super.a();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public DAINotifyImpl() {
        }

        /* loaded from: classes8.dex */
        public class DAIBroadcastReceiver extends BroadcastReceiver {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private List<g.c> b = new ArrayList();

            static {
                kge.a(717851391);
            }

            public DAIBroadcastReceiver() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null) {
                    Serializable serializableExtra = intent.getSerializableExtra("com.tmall.android.dai.intent.extra.OUTPUT_DATA");
                    for (g.c cVar : this.b) {
                        cVar.c.a(cVar, serializableExtra);
                    }
                }
            }

            public void a(g.c cVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("16567517", new Object[]{this, cVar});
                } else {
                    this.b.add(cVar);
                }
            }

            public void b(g.c cVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8001b36", new Object[]{this, cVar});
                } else {
                    this.b.remove(cVar);
                }
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void a(String str, g.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed70b58d", new Object[]{this, str, cVar});
                return;
            }
            DAIBroadcastReceiver dAIBroadcastReceiver = this.d.get(str);
            if (dAIBroadcastReceiver == null) {
                dAIBroadcastReceiver = new DAIBroadcastReceiver();
                this.d.put(str, dAIBroadcastReceiver);
                IntentFilter intentFilter = new IntentFilter(DAI.ACTION_COMPUTE_COMPLETE);
                if (Build.VERSION.SDK_INT >= 19) {
                    intentFilter.addDataSchemeSpecificPart("com.tmall.android.dai", 1);
                }
                intentFilter.addDataScheme(str);
                ab.a().registerReceiver(dAIBroadcastReceiver, intentFilter);
            }
            dAIBroadcastReceiver.a(cVar);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void b(String str, g.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89deb1ec", new Object[]{this, str, cVar});
                return;
            }
            DAIBroadcastReceiver dAIBroadcastReceiver = this.d.get(str);
            if (dAIBroadcastReceiver == null) {
                return;
            }
            dAIBroadcastReceiver.b(cVar);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            super.a();
            Collection<DAIBroadcastReceiver> values = this.d.values();
            if (values != null) {
                for (DAIBroadcastReceiver dAIBroadcastReceiver : values) {
                    ab.a().unregisterReceiver(dAIBroadcastReceiver);
                }
            }
            this.d.clear();
        }
    }

    /* loaded from: classes8.dex */
    public class i extends com.taobao.tao.flexbox.layoutmanager.module.notify.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private HashMap<String, List<g.b>> d;
        private g e;

        static {
            kge.a(600038911);
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            if (str.hashCode() == 90991720) {
                super.a();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public i() {
        }

        public static /* synthetic */ HashMap a(i iVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("a96145fd", new Object[]{iVar}) : iVar.d;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void a(String str, g.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed70b58d", new Object[]{this, str, cVar});
                return;
            }
            if (this.d == null) {
                this.d = new HashMap<>();
                this.e = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().a(new h() { // from class: com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.i.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.h
                    public void a(JSONObject jSONObject) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                            return;
                        }
                        List<g.b> list = (List) i.a(i.this).get(jSONObject.getString("event"));
                        if (list == null) {
                            return;
                        }
                        JSONObject jSONObject2 = jSONObject.getJSONObject("param");
                        for (g.b bVar : list) {
                            bVar.f19937a.c.a(bVar.f19937a, jSONObject2);
                        }
                    }
                });
            }
            List<g.b> list = this.d.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.d.put(str, list);
            }
            list.add(new g.b(cVar));
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void b(String str, g.c cVar) {
            Iterator<g.b> it;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89deb1ec", new Object[]{this, str, cVar});
                return;
            }
            List<g.b> list = this.d.get(str);
            if (list == null || (it = list.iterator()) == null) {
                return;
            }
            while (it.hasNext()) {
                if (a(it.next().f19937a, cVar)) {
                    it.remove();
                }
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            super.a();
            g gVar = this.e;
            if (gVar != null) {
                gVar.a();
            }
            HashMap<String, List<g.b>> hashMap = this.d;
            if (hashMap == null) {
                return;
            }
            hashMap.clear();
        }
    }

    /* loaded from: classes8.dex */
    public class e extends com.taobao.tao.flexbox.layoutmanager.module.notify.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private p.a d;

        static {
            kge.a(-1836999676);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -311380595) {
                super.a((String) objArr[0], (g.c) objArr[1]);
                return null;
            } else if (hashCode != 90991720) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.a();
                return null;
            }
        }

        public e() {
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void a(String str, g.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed70b58d", new Object[]{this, str, cVar});
                return;
            }
            super.a(str, cVar);
            if (this.d != null) {
                return;
            }
            this.d = new p.a() { // from class: com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.p.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (String str2 : e.this.b()) {
                        e.this.a(str2, jSONObject);
                    }
                }
            };
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().C().a(this.d);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            super.a();
            if (oeb.a("fixRevisitionMemLeak", true)) {
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().C().a(null);
            }
            this.d = null;
        }
    }
}
