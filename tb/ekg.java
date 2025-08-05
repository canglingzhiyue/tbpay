package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderIO;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

@AURAExtensionImpl(code = "alidetail.impl.locator.connector")
/* loaded from: classes4.dex */
public final class ekg implements ath {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private f f27361a;

    static {
        kge.a(30374878);
        kge.a(-450410939);
    }

    @Override // tb.ath
    public void a(View view, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b016bcab", new Object[]{this, view, state});
        }
    }

    @Override // tb.ath
    public void a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7f23d3", new Object[]{this, aURARenderComponent});
        }
    }

    @Override // tb.ath
    public void a(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        }
    }

    @Override // tb.ath
    public void b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ed2032", new Object[]{this, aURARenderComponent});
        }
    }

    @Override // tb.atf
    public RecyclerView getContainerView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("a859cf93", new Object[]{this, context});
        }
        return null;
    }

    @Override // tb.atf
    public void onContentViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1c2042", new Object[]{this, view});
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public ekg() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.locator.AliSDetailLocatorConnectorExtension");
    }

    @Override // tb.ath
    public void a(AURAInputData<AURARenderIO> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4bc11", new Object[]{this, aURAInputData});
        } else {
            a(this.f27361a);
        }
    }

    private void a(final f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c68e2fc", new Object[]{this, fVar});
        } else if (fVar != null) {
            eki ekiVar = new eki() { // from class: tb.ekg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.eki
                public void a(final ekk ekkVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e703dc33", new Object[]{this, ekkVar});
                    } else {
                        a(ekkVar, new aqt<ekl>() { // from class: tb.ekg.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.aqt
                            public void a(ekl eklVar) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("e7045092", new Object[]{this, eklVar});
                                } else {
                                    eklVar.a(ekkVar);
                                }
                            }
                        });
                    }
                }

                @Override // tb.eki
                public void b(final ekk ekkVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d586e2b4", new Object[]{this, ekkVar});
                    } else {
                        a(ekkVar, new aqt<ekl>() { // from class: tb.ekg.1.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.aqt
                            public void a(ekl eklVar) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("e7045092", new Object[]{this, eklVar});
                                } else {
                                    eklVar.b(ekkVar);
                                }
                            }
                        });
                    }
                }

                @Override // tb.eki
                public void c(final ekk ekkVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c409e935", new Object[]{this, ekkVar});
                    } else {
                        a(ekkVar, new aqt<ekl>() { // from class: tb.ekg.1.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.aqt
                            public void a(ekl eklVar) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("e7045092", new Object[]{this, eklVar});
                                } else {
                                    eklVar.c(ekkVar);
                                }
                            }
                        });
                    }
                }

                private void a(ekk ekkVar, aqt<ekl> aqtVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("798592df", new Object[]{this, ekkVar, aqtVar});
                        return;
                    }
                    for (ekl eklVar : fVar.b(ekl.class)) {
                        String F_ = eklVar.F_();
                        if (F_ == null) {
                            aqtVar.a(eklVar);
                        } else if (ekkVar.c().contains(F_)) {
                            aqtVar.a(eklVar);
                        }
                    }
                }
            };
            for (ekm ekmVar : fVar.b(ekm.class)) {
                ekmVar.a(ekiVar);
            }
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.f27361a = fVar;
        }
    }
}
