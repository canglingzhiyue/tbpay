package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.home.component.utils.b;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.view.manager.searchbar.impl.bgview.HomeSearchBarBgView;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import java.util.List;
import tb.qzl;

/* loaded from: classes7.dex */
public class tgv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final law f34086a;
    private final HomeSearchBarBgView b;
    private tgs c;
    private qzl.a d;
    private tgr e;
    private boolean f;
    private String g = "recommend_recommend";

    static {
        kge.a(811120607);
    }

    public static /* synthetic */ String a(tgv tgvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4849861", new Object[]{tgvVar, str});
        }
        tgvVar.g = str;
        return str;
    }

    public static /* synthetic */ tgr a(tgv tgvVar, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tgr) ipChange.ipc$dispatch("a3bf58c1", new Object[]{tgvVar, iContainerDataModel}) : tgvVar.a(iContainerDataModel);
    }

    public static /* synthetic */ tgr a(tgv tgvVar, tgr tgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tgr) ipChange.ipc$dispatch("64e7c301", new Object[]{tgvVar, tgrVar});
        }
        tgvVar.e = tgrVar;
        return tgrVar;
    }

    public static /* synthetic */ boolean a(tgv tgvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("692f99", new Object[]{tgvVar})).booleanValue() : tgvVar.f;
    }

    public static /* synthetic */ void b(tgv tgvVar, tgr tgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9199c7", new Object[]{tgvVar, tgrVar});
        } else {
            tgvVar.a(tgrVar);
        }
    }

    public tgv(law lawVar, HomeSearchBarBgView homeSearchBarBgView) {
        this.f34086a = lawVar;
        this.b = homeSearchBarBgView;
        a(this.f34086a);
        d();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c();
        e();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        tgr tgrVar = this.e;
        if (tgrVar == null || this.f) {
            return;
        }
        a(tgrVar);
        ldf.d("SearchBarBgObserver", "氛围变化，更新背景");
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.f = b(jSONObject);
        if (this.f) {
            this.b.setVisibility(8);
            ldf.d("SearchBarBgObserver", "搜索栏数据更新时，开关为空");
            return;
        }
        int a2 = sqy.a(jSONObject);
        if (a2 == -1) {
            ldf.d("SearchBarBgObserver", "搜索栏数据更新时，默认背景色为空");
            return;
        }
        String b = sqy.b(jSONObject);
        this.b.setVisibility(0);
        ldf.d("SearchBarBgObserver", "搜索栏数据更新时,更新兜底背景");
        this.b.recordDefaultBg(b, a2);
    }

    private void a(law lawVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26e51f6", new Object[]{this, lawVar});
        } else if (lawVar == null) {
            ldf.d("SearchBarBgObserver", "lifeCycleManager == null");
        } else {
            this.c = g();
            lawVar.d().a(this.c);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        law lawVar = this.f34086a;
        if (lawVar == null || this.c == null) {
            ldf.d("SearchBarBgObserver", "mLifeCycleManager == null || mTabLifeCycle == null");
        } else {
            lawVar.d().b(this.c);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.d == null) {
            this.d = f();
        }
        oql.a().o().a(this.d, ksk.NEW_FACE_PARENT.f30287a);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            oql.a().o().b(this.d, ksk.NEW_FACE_PARENT.f30287a);
        }
    }

    private qzl.a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qzl.a) ipChange.ipc$dispatch("dd506519", new Object[]{this}) : new qzl.a() { // from class: tb.tgv.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qzl.a
            public void a(JSONObject jSONObject, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96bbefbd", new Object[]{this, jSONObject, iContainerDataModel, str});
                    return;
                }
                tgr a2 = tgv.a(tgv.this, iContainerDataModel);
                if (a2 == null) {
                    return;
                }
                ldf.d("SearchBarBgObserver", "请求回来更新");
                tgv.a(tgv.this, a2);
                tgv.b(tgv.this, a2);
            }
        };
    }

    private tgs g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tgs) ipChange.ipc$dispatch("3d34d0f8", new Object[]{this}) : new tgs() { // from class: tb.tgv.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.tgs
            public void a(float f, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c0ff5ab", new Object[]{this, new Float(f), new Integer(i)});
                }
            }

            @Override // tb.tgs
            public void a(String str, tgr tgrVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4051d3e3", new Object[]{this, str, tgrVar});
                } else if (tgrVar == null) {
                    ldf.d("SearchBarBgObserver", "切tab时，tab数据为空");
                } else if (tgv.a(tgv.this)) {
                    ldf.d("SearchBarBgObserver", "切tab时，开关是关的");
                } else {
                    tgv.a(tgv.this, tgrVar);
                    tgv.a(tgv.this, str);
                    ldf.d("SearchBarBgObserver", "selectTab 更新背景");
                    tgv.b(tgv.this, tgrVar);
                }
            }
        };
    }

    private void a(tgr tgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675e19", new Object[]{this, tgrVar});
        } else if (this.b == null) {
        } else {
            boolean z = !tgrVar.e() && !StringUtils.isEmpty(FestivalMgr.a().a("global", "actionBarBackgroundColor"));
            int d = tgrVar.d();
            String c = tgrVar.c();
            if (a(this.b.getContext())) {
                this.b.updateCustomBg(null, 0);
                e.e("SearchBarBgObserver", "开启了深色模式");
            } else if (StringUtils.isEmpty(c) && d <= 0) {
                this.b.restoreToDefault();
                ldf.d("SearchBarBgObserver", "没有tab氛围时展示为默认背景");
            } else if (z) {
                this.b.restoreToDefault();
                ldf.d("SearchBarBgObserver", "有皮肤 重置背景层");
            } else {
                ldf.d("SearchBarBgObserver", "更新背景层，bgImageUrl： " + c);
                this.b.updateCustomBg(c, d);
            }
        }
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : b.a(context);
    }

    private boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue() : !sqy.c(jSONObject);
    }

    private tgr a(IContainerDataModel<?> iContainerDataModel) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (tgr) ipChange.ipc$dispatch("8200ed4", new Object[]{this, iContainerDataModel});
        }
        JSONObject a2 = com.taobao.tao.infoflow.multitab.e.a(iContainerDataModel);
        if (a2 == null) {
            ldf.d("SearchBarBgObserver", "assembleLinkedTabUiConfig tabSection == null");
            return null;
        }
        List<JSONObject> a3 = com.taobao.tao.infoflow.multitab.e.a(a2);
        if (a3 == null) {
            ldf.d("SearchBarBgObserver", "assembleLinkedTabUiConfig tabList == null");
            return null;
        }
        while (true) {
            if (i >= a3.size()) {
                jSONObject = null;
                break;
            }
            jSONObject = a3.get(i);
            if (StringUtils.equals(com.taobao.tao.infoflow.multitab.e.l(jSONObject), this.g)) {
                break;
            }
            i++;
        }
        return com.taobao.tao.infoflow.multitab.e.a(jSONObject, a2);
    }
}
