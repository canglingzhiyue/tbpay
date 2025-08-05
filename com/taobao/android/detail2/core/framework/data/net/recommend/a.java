package com.taobao.android.detail2.core.framework.data.net.recommend;

import android.os.Looper;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bpt;
import tb.fjp;
import tb.fkz;
import tb.ipa;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REC_APP_ID = "31750";

    /* renamed from: a  reason: collision with root package name */
    private b f11529a;
    private com.taobao.android.detail2.core.optimize.preload.b b;
    private Queue<InterfaceC0459a> e = new ArrayDeque();

    /* renamed from: com.taobao.android.detail2.core.framework.data.net.recommend.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0459a {
        void a(boolean z, int i, String str);

        void a(boolean z, JSONArray jSONArray, JSONObject jSONObject, MtopResponse mtopResponse);
    }

    static {
        kge.a(-1411920743);
    }

    public static /* synthetic */ void a(a aVar, boolean z, int i, JSONObject jSONObject, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d79a0a06", new Object[]{aVar, new Boolean(z), new Integer(i), jSONObject, mtopResponse});
        } else {
            aVar.a(z, i, jSONObject, mtopResponse);
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0ae6659", new Object[]{aVar, new Boolean(z), new Integer(i), str});
        } else {
            aVar.a(z, i, str);
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z, int i, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0ba54", new Object[]{aVar, new Boolean(z), new Integer(i), mtopResponse});
        } else {
            aVar.b(z, i, mtopResponse);
        }
    }

    public a(b bVar) {
        this.f11529a = bVar;
    }

    public void a(com.taobao.android.detail2.core.optimize.preload.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2abf09e", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }

    private boolean a(boolean z, int i, InterfaceC0459a interfaceC0459a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6dca8b6", new Object[]{this, new Boolean(z), new Integer(i), interfaceC0459a})).booleanValue();
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        if (interfaceC0459a != null) {
            try {
                interfaceC0459a.a(z, i, "please call method in main thread");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public void a(boolean z, int i, RecRequestParamsV2 recRequestParamsV2, InterfaceC0459a interfaceC0459a, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e536847a", new Object[]{this, new Boolean(z), new Integer(i), recRequestParamsV2, interfaceC0459a, new Boolean(z2), new Boolean(z3)});
        } else if (!a(z, i, interfaceC0459a)) {
        } else {
            this.e.offer(interfaceC0459a);
            fkz fkzVar = new fkz(this.f11529a.g(), com.taobao.android.detail2.core.optimize.preload.a.a(recRequestParamsV2, this.f11529a.h(), this.b, i), i == 0 ? "NewNewDetailFirst" : "NewNewDetailNext", z2, z3);
            fkzVar.a(new RecInfoManager$1(this, z, i));
            a(z, i);
            fkzVar.a();
        }
    }

    private void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        if (!z && i == 0) {
            fjp.b(this.f11529a.f(), fjp.SECTION_CONTAINER_INIT, "");
            fjp.a(this.f11529a.f(), fjp.SECTION_FIRST_TPP_REQUEST, "");
            fjp.a("eventProcess", fjp.UMBRELLA_TAG_FIRST_PAGE_REQUEST, (Map<String, String>) null);
        }
        fjp.a("eventProcess", fjp.UMBRELLA_TAG_REQUEST, (Map<String, String>) null);
    }

    @Deprecated
    private JSONObject a(boolean z, int i, MtopResponse mtopResponse) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d1f6be3c", new Object[]{this, new Boolean(z), new Integer(i), mtopResponse});
        }
        try {
            jSONObject = JSONObject.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
        } catch (Throwable th) {
            th.printStackTrace();
            jSONObject = null;
        }
        String a2 = bpt.a(mtopResponse);
        if (jSONObject == null || jSONObject.keySet().size() == 0) {
            a(z, i, "empty data");
            fjp.a("recommend", fjp.ERROR_CODE_RECOMMEND_DATA_EMPTY, "推荐data数据为空, itemId: " + this.b.i + ", isPageUp: " + z + ", pageIndex: " + i, this.f11529a.h().T(), "", a2);
            return jSONObject;
        }
        a(jSONObject);
        if (jSONObject.getJSONArray("sectionList") != null) {
            return jSONObject;
        }
        a(z, i, "empty sectionList");
        fjp.a("recommend", fjp.ERROR_CODE_RECOMMEND_SECTION_EMPTY, "推荐section列表数据为空, itemId: " + this.b.i + ", isPageUp: " + z + ", pageIndex: " + i, this.f11529a.h().T(), "", a2);
        return null;
    }

    private void a(boolean z, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be3bf21", new Object[]{this, new Boolean(z), new Integer(i), str});
            return;
        }
        ArrayList<InterfaceC0459a> arrayList = new ArrayList();
        while (this.e.peek() != null) {
            arrayList.add(this.e.poll());
        }
        for (InterfaceC0459a interfaceC0459a : arrayList) {
            try {
                interfaceC0459a.a(z, i, str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("passParams");
        if (jSONObject2 == null) {
            return;
        }
        this.b.g = jSONObject2;
    }

    private void b(final boolean z, int i, final JSONObject jSONObject, final MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191a735d", new Object[]{this, new Boolean(z), new Integer(i), jSONObject, mtopResponse});
            return;
        }
        final JSONArray jSONArray = jSONObject.getJSONArray("sectionList");
        if (jSONArray == null || jSONArray.isEmpty()) {
            a(z, i, "no more items");
            return;
        }
        ArrayList<InterfaceC0459a> arrayList = new ArrayList();
        while (this.e.peek() != null) {
            arrayList.add(this.e.poll());
        }
        long j = 0;
        for (final InterfaceC0459a interfaceC0459a : arrayList) {
            ipa.N().postDelayed(new Runnable() { // from class: com.taobao.android.detail2.core.framework.data.net.recommend.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        interfaceC0459a.a(z, jSONArray, jSONObject, mtopResponse);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }, (j << 1) + 1);
            j++;
        }
    }

    private void a(boolean z, int i, JSONObject jSONObject, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea97a3e", new Object[]{this, new Boolean(z), new Integer(i), jSONObject, mtopResponse});
        } else if (ipa.am()) {
            b(z, i, jSONObject, mtopResponse);
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("sectionList");
            if (jSONArray == null || jSONArray.isEmpty()) {
                a(z, i, "no more items");
                return;
            }
            ArrayList<InterfaceC0459a> arrayList = new ArrayList();
            while (this.e.peek() != null) {
                arrayList.add(this.e.poll());
            }
            for (InterfaceC0459a interfaceC0459a : arrayList) {
                try {
                    interfaceC0459a.a(z, jSONArray, jSONObject, mtopResponse);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private void b(boolean z, int i, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a98bae1d", new Object[]{this, new Boolean(z), new Integer(i), mtopResponse});
            return;
        }
        a(z, i, mtopResponse.getRetMsg());
        fjp.a("eventProcess", fjp.UMBRELLA_TAG_REQUEST_FAIL, (Map<String, String>) null);
        if (!"FAIL_SYS_SERVICE_TIMEOUT".equals(mtopResponse.getRetCode())) {
            return;
        }
        fjp.a("eventProcess", fjp.UMBRELLA_TAG_REQUEST_TIME_OUT, (Map<String, String>) null);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.e.clear();
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else {
            this.b.h.put(str, (Object) jSONObject);
        }
    }
}
