package com.taobao.mytaobao.ultron;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.jnv;
import tb.jny;
import tb.kge;
import tb.mtz;

/* loaded from: classes7.dex */
public class h extends jnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final WeakReference<e> b;
    private String c;

    static {
        kge.a(-1549777504);
    }

    @Override // tb.jnv
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ WeakReference a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("581cd76", new Object[]{hVar}) : hVar.b;
    }

    public static /* synthetic */ String b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("579e0757", new Object[]{hVar}) : hVar.c;
    }

    public h(String str, e eVar) {
        this.c = str;
        this.b = new WeakReference<>(eVar);
    }

    @Override // tb.joc
    public void a(int i, final MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
        } else {
            mtz.a(new Runnable() { // from class: com.taobao.mytaobao.ultron.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    e eVar = (e) h.a(h.this).get();
                    if (eVar == null) {
                        return;
                    }
                    eVar.a(h.b(h.this), mtopResponse);
                }
            });
        }
    }

    @Override // tb.joc
    public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
            return;
        }
        e eVar = this.b.get();
        if (eVar == null) {
            return;
        }
        eVar.a(this.c, mtopResponse, i, jnyVar);
        if (mtopResponse == null || mtopResponse.getBytedata() == null) {
            return;
        }
        TLog.loge("mtbDataLink", "【非首次】主接口onResult success,data=" + new String(mtopResponse.getBytedata()));
    }
}
