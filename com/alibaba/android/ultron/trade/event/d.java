package com.alibaba.android.ultron.trade.event;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.bmy;
import tb.bmz;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class d implements bmy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public bmz d;
    public Context e;
    public com.alibaba.android.ultron.trade.presenter.c f;
    public jny g;
    public IDMComponent h;
    public boolean i = false;
    public int j = 200;

    /* renamed from: a  reason: collision with root package name */
    private long f2661a = 0;
    private String b = "";

    static {
        kge.a(-353493645);
        kge.a(162832397);
    }

    public abstract void b(bmz bmzVar);

    @Override // tb.bmy
    public void a(bmz bmzVar) {
        com.alibaba.android.ultron.trade.presenter.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20852e9", new Object[]{this, bmzVar});
        } else if (bmzVar == null) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f2661a < this.j && this.i && this.b.equals(bmzVar.b())) {
                return;
            }
            this.f2661a = currentTimeMillis;
            this.b = bmzVar.b();
            this.d = bmzVar;
            this.e = bmzVar.a();
            this.f = bmzVar.d();
            if (this.e == null || (cVar = this.f) == null) {
                return;
            }
            this.g = cVar.H();
            this.h = bmzVar.c();
            IDMComponent iDMComponent = this.h;
            if (iDMComponent != null) {
                iDMComponent.updateModifiedCount();
            }
            b(bmzVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.i = true;
        }
    }

    public <T> T a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)}) : (T) a("viewParams", i);
    }

    public <T> T b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("e7d36638", new Object[]{this, new Integer(i)}) : (T) a("extraParams", i);
    }

    public <T> T a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        bmz bmzVar = this.d;
        if (bmzVar != null) {
            return (T) bmzVar.b(str);
        }
        return null;
    }

    private <T> T a(String str, int i) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("83330e41", new Object[]{this, str, new Integer(i)});
        }
        bmz bmzVar = this.d;
        if (bmzVar == null) {
            return null;
        }
        Object b = bmzVar.b(str);
        if (b instanceof Object[]) {
            list = Arrays.asList((Object[]) b);
        } else {
            list = b instanceof List ? (List) b : null;
        }
        if (list != null && i < list.size()) {
            return (T) list.get(i);
        }
        return null;
    }

    public com.taobao.android.ultron.common.model.b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("b820e1dc", new Object[]{this});
        }
        bmz bmzVar = this.d;
        if (bmzVar == null) {
            return null;
        }
        Object e = bmzVar.e();
        if (!(e instanceof com.taobao.android.ultron.common.model.b)) {
            return null;
        }
        return (com.taobao.android.ultron.common.model.b) e;
    }

    public JSONObject c() {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        com.taobao.android.ultron.common.model.b b = b();
        if (b != null && (fields = b.getFields()) != null) {
            return fields;
        }
        return null;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        JSONObject c = c();
        return c != null && c.getBooleanValue("request");
    }

    public boolean a(IDMComponent iDMComponent, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be0a1e1d", new Object[]{this, iDMComponent, map})).booleanValue();
        }
        if (map != null && !map.isEmpty() && iDMComponent != null) {
            try {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    iDMComponent.getFields().put(entry.getKey(), entry.getValue());
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public boolean a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue() : a(this.h, map);
    }

    public boolean a(com.taobao.android.ultron.common.model.b bVar, Map<String, ? extends Object> map) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fc017b2", new Object[]{this, bVar, map})).booleanValue();
        }
        if (map == null || map.isEmpty() || bVar == null || (fields = bVar.getFields()) == null) {
            return false;
        }
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            fields.put(entry.getKey(), entry.getValue());
        }
        return true;
    }

    public boolean b(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41e3e880", new Object[]{this, map})).booleanValue() : a(b(), map);
    }

    public void e() {
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.h == null || (c = c()) == null) {
        } else {
            String string = c.getString("action");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.h.setAdjustOperatorAction(string);
        }
    }
}
