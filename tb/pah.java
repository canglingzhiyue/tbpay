package tb;

import com.alilive.adapter.uikit.TLiveRoundedCornersProcessor;
import com.alilive.adapter.uikit.f;
import com.alilive.adapter.uikit.g;
import com.alilive.adapter.uikit.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.effects.RoundedCornersBitmapProcessor;
import com.taobao.phenix.compat.effects.b;
import com.taobao.phenix.compat.effects.c;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;

/* loaded from: classes8.dex */
public class pah implements pnh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PhenixCreator f32528a;
    private String b;

    /* renamed from: tb.pah$3  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32531a = new int[TLiveRoundedCornersProcessor.CornerType.values().length];

        static {
            try {
                f32531a[TLiveRoundedCornersProcessor.CornerType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32531a[TLiveRoundedCornersProcessor.CornerType.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32531a[TLiveRoundedCornersProcessor.CornerType.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32531a[TLiveRoundedCornersProcessor.CornerType.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32531a[TLiveRoundedCornersProcessor.CornerType.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        kge.a(-1629104151);
        kge.a(-2085990977);
    }

    public static /* synthetic */ PhenixCreator a(pah pahVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PhenixCreator) ipChange.ipc$dispatch("273f3714", new Object[]{pahVar}) : pahVar.f32528a;
    }

    public pah(String str, PhenixCreator phenixCreator) {
        this.f32528a = phenixCreator;
        this.b = str;
    }

    public pah() {
    }

    @Override // tb.pnh
    public pnh a(png... pngVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pnh) ipChange.ipc$dispatch("8281fd48", new Object[]{this, pngVarArr});
        }
        if (this.f32528a != null) {
            nia[] niaVarArr = new nia[pngVarArr.length];
            for (int i = 0; i < niaVarArr.length; i++) {
                if (pngVarArr[i] instanceof f) {
                    f fVar = (f) pngVarArr[i];
                    niaVarArr[i] = new b(fVar.a(), fVar.b(), fVar.c());
                } else if (pngVarArr[i] instanceof g) {
                    g gVar = (g) pngVarArr[i];
                    niaVarArr[i] = new c(gVar.a(), gVar.b());
                } else if (pngVarArr[i] instanceof TLiveRoundedCornersProcessor) {
                    TLiveRoundedCornersProcessor tLiveRoundedCornersProcessor = (TLiveRoundedCornersProcessor) pngVarArr[i];
                    RoundedCornersBitmapProcessor.CornerType cornerType = RoundedCornersBitmapProcessor.CornerType.ALL;
                    int i2 = AnonymousClass3.f32531a[tLiveRoundedCornersProcessor.e().ordinal()];
                    if (i2 == 1) {
                        cornerType = RoundedCornersBitmapProcessor.CornerType.ALL;
                    } else if (i2 == 2) {
                        cornerType = RoundedCornersBitmapProcessor.CornerType.TOP;
                    } else if (i2 == 3) {
                        cornerType = RoundedCornersBitmapProcessor.CornerType.LEFT;
                    } else if (i2 == 4) {
                        cornerType = RoundedCornersBitmapProcessor.CornerType.RIGHT;
                    } else if (i2 == 5) {
                        cornerType = RoundedCornersBitmapProcessor.CornerType.BOTTOM;
                    }
                    niaVarArr[i] = new RoundedCornersBitmapProcessor(tLiveRoundedCornersProcessor.a(), tLiveRoundedCornersProcessor.b(), tLiveRoundedCornersProcessor.c(), tLiveRoundedCornersProcessor.d(), cornerType);
                } else if (pngVarArr[i] instanceof h) {
                    niaVarArr[i] = new pag((h) pngVarArr[i]);
                }
            }
            this.f32528a.bitmapProcessors(niaVarArr);
        }
        return this;
    }

    @Override // tb.pnh
    public pnh a(final pnf pnfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pnh) ipChange.ipc$dispatch("f5d437ec", new Object[]{this, pnfVar});
        }
        PhenixCreator phenixCreator = this.f32528a;
        if (phenixCreator != null) {
            phenixCreator.succListener(new a<SuccPhenixEvent>() { // from class: tb.pah.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (pnfVar != null && succPhenixEvent.getDrawable() != null) {
                        pnfVar.a(succPhenixEvent.getDrawable());
                    }
                    pah.a(pah.this).succListener(null);
                    return false;
                }
            }).failListener(new a<FailPhenixEvent>() { // from class: tb.pah.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    pnf pnfVar2 = pnfVar;
                    if (pnfVar2 != null) {
                        pnfVar2.b(Integer.valueOf(failPhenixEvent.getResultCode()));
                    }
                    pah.a(pah.this).failListener(null);
                    return false;
                }
            });
        }
        return this;
    }

    @Override // tb.pnh
    public pnh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pnh) ipChange.ipc$dispatch("f093834", new Object[]{this});
        }
        PhenixCreator phenixCreator = this.f32528a;
        if (phenixCreator != null) {
            phenixCreator.fetch();
        }
        return this;
    }
}
