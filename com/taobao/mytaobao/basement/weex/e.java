package com.taobao.mytaobao.basement.weex;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.i;
import tb.kge;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Handler c;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f18352a = new JSONObject();
    private i.b b;
    private com.taobao.mytaobao.pagev2.b d;

    public static /* synthetic */ void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13da6484", new Object[]{eVar});
        } else {
            eVar.c();
        }
    }

    static {
        kge.a(-1488912231);
        c = new Handler(Looper.getMainLooper());
    }

    public e(i.b bVar) {
        this.b = bVar;
    }

    public e(com.taobao.mytaobao.pagev2.b bVar) {
        this.d = bVar;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            b();
        } else if (i != 0) {
        } else {
            c.post(new Runnable() { // from class: com.taobao.mytaobao.basement.weex.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        e.a(e.this);
                    }
                }
            });
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c.removeCallbacksAndMessages(null);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f18352a.put("status", (Object) "start");
        i.b bVar = this.b;
        if (bVar != null) {
            bVar.a("notifyMyTaoBaoScrollStatusChange", this.f18352a);
        }
        com.taobao.mytaobao.pagev2.b bVar2 = this.d;
        if (bVar2 == null) {
            return;
        }
        bVar2.a("notifyMyTaoBaoScrollStatusChange", this.f18352a);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f18352a.put("status", (Object) "end");
        i.b bVar = this.b;
        if (bVar != null) {
            bVar.a("notifyMyTaoBaoScrollStatusChange", this.f18352a);
        }
        com.taobao.mytaobao.pagev2.b bVar2 = this.d;
        if (bVar2 == null) {
            return;
        }
        bVar2.a("notifyMyTaoBaoScrollStatusChange", this.f18352a);
    }
}
