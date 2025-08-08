package tb;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel;
import com.taobao.realtimerecommend.j;
import com.taobao.taobao.R;
import tb.lkz;

/* loaded from: classes7.dex */
public class lhp implements lkz.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30615a;

    static {
        kge.a(1530065617);
        kge.a(-357951963);
    }

    @Override // tb.lkz.a
    public void a(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac4f93", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
        }
    }

    @Override // tb.lkz.a
    public void a_(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34bf30d", new Object[]{this, view});
        }
    }

    public static /* synthetic */ int a(lhp lhpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f2cdc7d7", new Object[]{lhpVar})).intValue() : lhpVar.a();
    }

    public static /* synthetic */ void a(lhp lhpVar, int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("157e129b", new Object[]{lhpVar, new Integer(i), view, baseSectionModel});
        } else {
            lhpVar.c(i, view, baseSectionModel);
        }
    }

    public static /* synthetic */ void b(lhp lhpVar, int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e895e1c", new Object[]{lhpVar, new Integer(i), view, baseSectionModel});
        } else {
            lhpVar.d(i, view, baseSectionModel);
        }
    }

    public lhp(ljs ljsVar) {
        this.f30615a = ljsVar;
    }

    @Override // tb.lkz.a
    public void a(final int i, final View view, final BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0524b1f", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else {
            ljd.a().a(new Runnable() { // from class: tb.lhp.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lhp.a(lhp.this, i, view, baseSectionModel);
                    }
                }
            });
        }
    }

    @Override // tb.lkz.a
    public void b(final int i, final View view, final BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5fda7a0", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else {
            ljd.a().a(new Runnable() { // from class: tb.lhp.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lhp.b(lhp.this, i, view, baseSectionModel);
                    }
                }
            });
        }
    }

    private void c(int i, View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba90421", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else if (baseSectionModel == null || baseSectionModel.getJSONObject("ext") == null || baseSectionModel.getJSONObject("ext").getBooleanValue("hidden")) {
        } else {
            JSONObject jSONObject = baseSectionModel.getJSONObject("args");
            if (jSONObject != null) {
                jSONObject.put("realExposeIndex", (Object) Integer.valueOf(i));
            }
            if (baseSectionModel.getBooleanValue(j.IS_USER_ACTION_TRACKED)) {
                baseSectionModel.put("isFirstAppear", (Object) false);
            } else {
                baseSectionModel.put("isFirstAppear", (Object) true);
            }
            baseSectionModel.put(j.IS_USER_ACTION_TRACKED, (Object) true);
            ldf.b("real_time_rec", "fast expose sectionBizCode = " + baseSectionModel.getString("sectionBizCode") + " position=" + i);
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.getJSONObject("utLogMapEdge") != null) {
                a(baseSectionModel, view, i);
            } else if (jSONObject.getString("utLogMap") != null) {
                b(baseSectionModel, view, i);
            } else {
                c(baseSectionModel, view, i);
            }
        }
    }

    private void d(int i, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("915460a2", new Object[]{this, new Integer(i), view, baseSectionModel});
        } else if (((RecyclerView) view.getParent()) == null) {
        } else {
            String a2 = a(baseSectionModel);
            String b = b(baseSectionModel);
            if (StringUtils.isEmpty(b)) {
                b = "expose_guess_list_0";
            }
            a(new liv(view, view.getTag(R.id.tag_guess_item_id), a2, b));
        }
    }

    private String a(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9bc5cf0", new Object[]{this, baseSectionModel});
        }
        String c = this.f30615a.a().c();
        if (baseSectionModel == null) {
            return c;
        }
        BaseUtModel mo1096getExposureParam = baseSectionModel.mo1096getExposureParam();
        String page = mo1096getExposureParam != null ? mo1096getExposureParam.getPage() : null;
        return !StringUtils.isEmpty(page) ? page : c;
    }

    private String b(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41ad380f", new Object[]{this, baseSectionModel});
        }
        if (baseSectionModel == null || baseSectionModel.getJSONObject("ext") == null || baseSectionModel.getJSONObject("ext").getBooleanValue("hidden") || baseSectionModel.getJSONObject("args") == null) {
            return "";
        }
        JSONObject jSONObject = baseSectionModel.getJSONObject(h.TRACK_EXPOSURE_PARAM);
        return (jSONObject == null || StringUtils.isEmpty(jSONObject.getString("arg1"))) ? "expose_guess_list_0" : jSONObject.getString("arg1");
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            ljd.a().a(runnable);
        }
    }

    private void a(final JSONObject jSONObject, final View view, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb76bbf9", new Object[]{this, jSONObject, view, new Integer(i)});
        } else {
            a(new Runnable() { // from class: tb.lhp.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        liw.b(jSONObject, view, i, lhp.a(lhp.this));
                    }
                }
            });
        }
    }

    private void b(final JSONObject jSONObject, final View view, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5863d318", new Object[]{this, jSONObject, view, new Integer(i)});
        } else {
            a(new Runnable() { // from class: tb.lhp.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        liw.c(jSONObject, view, i, lhp.a(lhp.this));
                    }
                }
            });
        }
    }

    private void c(final JSONObject jSONObject, final View view, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e550ea37", new Object[]{this, jSONObject, view, new Integer(i)});
        } else {
            a(new Runnable() { // from class: tb.lhp.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        liw.a(jSONObject, view, i, lhp.a(lhp.this));
                    }
                }
            });
        }
    }

    private int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : Math.max(liy.a(this.f30615a), 0);
    }
}
