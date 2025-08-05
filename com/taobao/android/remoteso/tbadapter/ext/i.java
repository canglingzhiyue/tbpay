package com.taobao.android.remoteso.tbadapter.ext;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tb.iiv;
import tb.iix;
import tb.ijd;
import tb.ikq;

/* loaded from: classes6.dex */
public class i implements iix<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijd f14862a;

    public static /* synthetic */ void a(i iVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67721a77", new Object[]{iVar, list});
        } else {
            iVar.a(list);
        }
    }

    public static /* synthetic */ void b(i iVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a1a296", new Object[]{iVar, list});
        } else {
            iVar.c(list);
        }
    }

    public i(ijd ijdVar) {
        this.f14862a = ijdVar;
    }

    @Override // tb.iix
    public void a(Collection<String> collection, iiv<String, Void> iivVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a9de73", new Object[]{this, collection, iivVar});
            return;
        }
        RSoLog.c("prefetch, before rearrange, original=" + collection);
        final ArrayList<String> arrayList = new ArrayList(collection);
        ikq.a("rearrange,error", new Runnable() { // from class: com.taobao.android.remoteso.tbadapter.ext.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                i.a(i.this, arrayList);
                i.b(i.this, arrayList);
            }
        });
        RSoLog.c("prefetch, after rearrange, list=" + arrayList);
        for (String str : arrayList) {
            iivVar.a(str);
        }
    }

    private void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        List<String> a2 = this.f14862a.a("key_prefetch_high_priority_list", "avcodec,artc_engine,themis_gfx,ALBiometricsJni,PailitaoCUtil,lrc_core,AliNNPython,walle_base,MNN,MNN_Express,MNN_CL,mnnpybridge,kernelu4_7z_uc");
        if (a2.size() <= 0) {
            return;
        }
        for (int size = a2.size() - 1; size >= 0; size--) {
            String str = a2.get(size);
            if (list.remove(str)) {
                list.add(0, str);
            }
        }
    }

    private void c(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
            return;
        }
        List<String> a2 = this.f14862a.a("key_prefetch_low_priority_list", "JavaScriptCore,WTF,common_lib_uc");
        if (a2.size() <= 0) {
            return;
        }
        for (int size = a2.size() - 1; size >= 0; size--) {
            String str = a2.get(size);
            if (list.remove(str)) {
                list.add(list.size(), str);
            }
        }
    }
}
