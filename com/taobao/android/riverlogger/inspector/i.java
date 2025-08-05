package com.taobao.android.riverlogger.inspector;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class i extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ArrayList<a> b = new ArrayList<>();
    private final ConcurrentHashMap<Integer, h> c = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, h> d = new ConcurrentHashMap<>();
    private h e;
    private String g;
    private boolean i;
    private boolean j;
    private final ConcurrentHashMap<String, Boolean> k;
    private ChannelVerifyStatus u_;

    /* renamed from: com.taobao.android.riverlogger.inspector.i$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14917a = new int[ChannelVerifyStatus.values().length];

        static {
            try {
                f14917a[ChannelVerifyStatus.NotVerified.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14917a[ChannelVerifyStatus.Verifying.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14917a[ChannelVerifyStatus.VerifySuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14917a[ChannelVerifyStatus.VerifyFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f14918a;
        public h b;

        static {
            kge.a(823867070);
        }

        public a(JSONObject jSONObject, h hVar) {
            this.f14918a = jSONObject;
            this.b = hVar;
        }
    }

    static {
        kge.a(1513126454);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public void a(String str, MessagePriority messagePriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c3e794", new Object[]{this, str, messagePriority});
        }
    }

    public i() {
        this.u_ = com.taobao.android.riverlogger.internal.b.a() ? ChannelVerifyStatus.VerifySuccess : ChannelVerifyStatus.NotVerified;
        this.g = null;
        this.i = false;
        this.j = false;
        this.k = new ConcurrentHashMap<>();
    }

    public static /* synthetic */ void a(i iVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aee8b92", new Object[]{iVar, new Boolean(z), str});
        } else {
            iVar.a(z, str);
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.u_ == ChannelVerifyStatus.VerifySuccess;
    }

    public void a(JSONObject jSONObject, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3d891b", new Object[]{this, jSONObject, hVar});
        } else if (jSONObject == null) {
            hVar.a(g.a(-2, "invalid message"));
        } else {
            String optString = jSONObject.optString(g.ResponseId);
            if (!optString.isEmpty()) {
                h remove = this.d.remove(optString);
                if (remove == null) {
                    hVar.a(g.a(-4, "responseId not found"));
                    return;
                }
                remove.a(jSONObject);
                hVar.a(new JSONObject());
                return;
            }
            int i = AnonymousClass2.f14917a[this.u_.ordinal()];
            if (i == 1) {
                h();
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    hVar.a(g.a(-10, this.g));
                    return;
                }
                if (!this.f14907a) {
                    e.a(this);
                }
                c(jSONObject, hVar);
                return;
            }
            synchronized (this.b) {
                this.b.add(new a(jSONObject, hVar));
            }
        }
    }

    public void b(JSONObject jSONObject, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("151de9ba", new Object[]{this, jSONObject, hVar});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("filters");
        if (optJSONArray == null) {
            this.i = true;
            this.j = true;
        } else {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!optString.isEmpty()) {
                    if ("event".contentEquals(optString)) {
                        this.i = true;
                    } else if ("method".contentEquals(optString)) {
                        this.j = true;
                    } else {
                        this.k.put(optString, true);
                    }
                }
            }
        }
        this.e = hVar;
        if (this.u_ == ChannelVerifyStatus.NotVerified) {
            h();
        } else if (!this.f14907a && this.u_ == ChannelVerifyStatus.VerifySuccess) {
            e.a(this);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.u_ != ChannelVerifyStatus.NotVerified) {
        } else {
            this.u_ = ChannelVerifyStatus.Verifying;
            final WeakReference weakReference = new WeakReference(this);
            a("Local", new com.taobao.android.riverlogger.h() { // from class: com.taobao.android.riverlogger.inspector.i.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.riverlogger.h
                public void a(boolean z, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
                        return;
                    }
                    i iVar = (i) weakReference.get();
                    if (iVar == null) {
                        return;
                    }
                    i.a(iVar, z, str);
                }
            });
        }
    }

    private void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
        } else if (z) {
            this.u_ = ChannelVerifyStatus.VerifySuccess;
            e.a(this);
            synchronized (this.b) {
                Iterator<a> it = this.b.iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    c(next.f14918a, next.b);
                }
                this.b.clear();
            }
        } else {
            this.g = str;
            this.u_ = ChannelVerifyStatus.VerifyFailed;
            JSONObject a2 = g.a(101, str);
            synchronized (this.b) {
                Iterator<a> it2 = this.b.iterator();
                while (it2.hasNext()) {
                    it2.next().b.a(a2);
                }
                this.b.clear();
            }
        }
    }

    private void c(JSONObject jSONObject, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dfe4a59", new Object[]{this, jSONObject, hVar});
        } else if (jSONObject == null) {
            hVar.a(g.a(-2, "invalid message"));
        } else {
            int g = g();
            try {
                jSONObject.put("id", g);
            } catch (JSONException unused) {
            }
            this.c.put(Integer.valueOf(g), hVar);
            a(jSONObject);
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public void a(String str, String str2, JSONObject jSONObject, MessagePriority messagePriority, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c213a6e9", new Object[]{this, str, str2, jSONObject, messagePriority, hVar});
        } else if (str == null || this.e == null) {
        } else {
            if (this.u_ != ChannelVerifyStatus.VerifySuccess && !c.DEV_VERIFY.contentEquals(str)) {
                return;
            }
            if (hVar == null) {
                if (!this.i && !this.k.containsKey(str)) {
                    return;
                }
            } else if (!this.j && !this.k.containsKey(str)) {
                return;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (a(str, jSONObject)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("method", str);
                jSONObject2.put("params", jSONObject);
                jSONObject2.putOpt("sessionId", str2);
                if (hVar != null) {
                    String num = Integer.toString(g());
                    jSONObject2.put(g.ResponseId, num);
                    this.d.put(num, hVar);
                }
            } catch (JSONException unused) {
            }
            this.e.a(jSONObject2);
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public void a(String str, String str2, String str3, MessagePriority messagePriority, h hVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8072a6d", new Object[]{this, str, str2, str3, messagePriority, hVar});
        } else if (str == null || this.e == null) {
        } else {
            if (this.u_ != ChannelVerifyStatus.VerifySuccess && !c.DEV_VERIFY.contentEquals(str)) {
                return;
            }
            if (str3 != null) {
                try {
                    jSONObject = new JSONObject(str3);
                } catch (JSONException unused) {
                }
                a(str, str2, jSONObject, messagePriority, hVar);
            }
            jSONObject = null;
            a(str, str2, jSONObject, messagePriority, hVar);
        }
    }

    private boolean a(String str, JSONObject jSONObject) {
        JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3502d8d0", new Object[]{this, str, jSONObject})).booleanValue();
        }
        if ("Dev.log".equals(str) && "Bridge".equals(jSONObject.optString("module")) && (optJSONObject = jSONObject.optJSONObject("ext")) != null) {
            return optJSONObject.optString("name").startsWith("RiverLogger.");
        }
        return false;
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public void a(int i, String str, JSONObject jSONObject, MessagePriority messagePriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796682db", new Object[]{this, new Integer(i), str, jSONObject, messagePriority});
            return;
        }
        h remove = this.c.remove(Integer.valueOf(i));
        if (remove == null) {
            return;
        }
        remove.a(jSONObject);
    }
}
