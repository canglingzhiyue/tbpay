package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.m;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ISmartRtService;
import tb.lkz;

/* loaded from: classes7.dex */
public class lhn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lks<RecyclerView> f30608a;
    private final lkz.a b;

    static {
        kge.a(319828732);
    }

    public static /* synthetic */ void a(lhn lhnVar, ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48428c1", new Object[]{lhnVar, ljsVar});
        } else {
            lhnVar.b(ljsVar);
        }
    }

    public static /* synthetic */ boolean a(lhn lhnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2ccdf2a", new Object[]{lhnVar})).booleanValue() : lhnVar.b();
    }

    public static /* synthetic */ boolean a(lhn lhnVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cd02cb74", new Object[]{lhnVar, str})).booleanValue() : lhnVar.a(str);
    }

    public lhn(ljs ljsVar, lks<RecyclerView> lksVar) {
        this.f30608a = lksVar;
        this.b = a(ljsVar);
        this.f30608a.a(this.b);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f30608a.b(this.b);
        }
    }

    private lkz.a a(final ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lkz.a) ipChange.ipc$dispatch("f872ad4b", new Object[]{this, ljsVar});
        }
        final lhm lhmVar = new lhm(ljsVar);
        return new lkz.a() { // from class: tb.lhn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lkz.a
            public void a_(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b34bf30d", new Object[]{this, view});
                }
            }

            @Override // tb.lkz.a
            public void b(int i, View view, BaseSectionModel baseSectionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c5fda7a0", new Object[]{this, new Integer(i), view, baseSectionModel});
                }
            }

            @Override // tb.lkz.a
            public void a(boolean z, final int i, BaseSectionModel baseSectionModel, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ac4f93", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
                    return;
                }
                Boolean bool = (Boolean) m.a().a("nextPageSyncCheck", Boolean.class);
                if (bool != null && bool.booleanValue()) {
                    if (!lhmVar.a(i)) {
                        return;
                    }
                    ljd.a().a(new Runnable() { // from class: tb.lhn.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            lhn.a(lhn.this, ljsVar);
                            lhmVar.b(i);
                        }
                    });
                    return;
                }
                ljd.a().a(new Runnable() { // from class: tb.lhn.1.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!lhmVar.a(i)) {
                        } else {
                            lhn.a(lhn.this, ljsVar);
                            lhmVar.b(i);
                        }
                    }
                });
            }

            @Override // tb.lkz.a
            public void a(final int i, View view, final BaseSectionModel baseSectionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0524b1f", new Object[]{this, new Integer(i), view, baseSectionModel});
                    return;
                }
                Boolean bool = (Boolean) m.a().a("nextPageSyncCheck", Boolean.class);
                if (bool == null || !bool.booleanValue()) {
                    ljd.a().a(new Runnable() { // from class: tb.lhn.1.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (baseSectionModel == null) {
                            } else {
                                if (!lhn.a(lhn.this)) {
                                    ldf.d("RecycleViewNextPageHandler", "不允许loading出现时校验补偿触发翻页");
                                } else if (!lhn.a(lhn.this, baseSectionModel.getSectionBizCode()) || !lhmVar.a()) {
                                } else {
                                    lhmVar.b(i);
                                }
                            }
                        }
                    });
                } else if (baseSectionModel == null) {
                } else {
                    if (!lhn.a(lhn.this)) {
                        ldf.d("RecycleViewNextPageHandler", "不允许loading出现时校验补偿触发翻页");
                    } else if (!lhn.a(lhn.this, baseSectionModel.getSectionBizCode()) || !lhmVar.a()) {
                    } else {
                        ljd.a().a(new Runnable() { // from class: tb.lhn.1.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    lhmVar.b(i);
                                }
                            }
                        });
                    }
                }
            }
        };
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : "loading".equals(str);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : ldj.a("enableLoadAppearTriggerNextPage", true);
    }

    private void b(ljs ljsVar) {
        ISmartRtService iSmartRtService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e16e5a84", new Object[]{this, ljsVar});
        } else if (ljsVar == null || (iSmartRtService = (ISmartRtService) ljsVar.a(ISmartRtService.class)) == null) {
        } else {
            iSmartRtService.smartPreloadPredictStatistics();
        }
    }
}
