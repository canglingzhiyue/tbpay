package com.taobao.live.liveroom.good.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonArray;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import com.taobao.uniinfra_kmp.common_utils.serialization.a;
import com.taobao.uniinfra_kmp.common_utils.serialization.b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.kge;
import tb.tqh;
import tb.trf;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J$\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0012\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0018\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001c\u0010\u0019\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0002J\u0012\u0010\u001f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010 \u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0012\u0010!\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001c\u0010\"\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J&\u0010#\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/taobao/live/liveroom/good/model/TaoLiveDataHandler;", "", "<init>", "()V", "enablePreSale", "", "enableTwoButton", "mButtonStateHelper", "Lcom/taobao/live/liveroom/good/model/TaoLiveButtonStateHelper;", "configInit", "", "preProcessDataBeforeRender", "goodLiveContext", "Lcom/taobao/live/liveroom/good/model/TaoLiveGoodLiveContext;", "liveItem", "Lcom/taobao/live/liveroom/good/model/LiveItem;", "firstRecItemId", "", "checkBenefitNew", "currTime", "", "timeCheck", "checkData", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "mergeAtmosphere", "handleItemVip", "item", "isContainsTargetBenefit", "jsonList", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonArray;", "target", "handleIntellectTimeShift", "handlePreSaleData", "handleTimingState", "appendNativeInfo", "processPCG", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f17787a;
    private boolean b;
    private final TaoLiveButtonStateHelper c = new TaoLiveButtonStateHelper();

    static {
        kge.a(1779529650);
    }

    public final void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.f17787a = z;
        this.b = z2;
    }

    public final void a(f fVar, LiveItem liveItem, String str) {
        e e;
        e e2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d45f0d", new Object[]{this, fVar, liveItem, str});
        } else if (liveItem == null) {
        } else {
            a(liveItem);
            a(fVar, liveItem);
            b(liveItem);
            a(liveItem, this.f17787a);
            c(liveItem);
            TaoLiveButtonStateHelper taoLiveButtonStateHelper = this.c;
            boolean z2 = this.b;
            if ((fVar == null || (e2 = fVar.e()) == null) ? true : e2.e()) {
                if ((fVar == null || (e = fVar.e()) == null) ? true : e.f()) {
                    z = true;
                }
            }
            taoLiveButtonStateHelper.a(fVar, liveItem, z2, z);
            b(fVar, liveItem);
            a(liveItem, fVar, str);
        }
    }

    public final void a(LiveItem liveItem, long j) {
        KMPJsonObject itemExtData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a655336c", new Object[]{this, liveItem, new Long(j)});
        } else if (liveItem != null && (itemExtData = liveItem.getItemExtData()) != null) {
            KMPJsonArray jsonArray = itemExtData.getJsonArray("itemBenefitLabels");
            KMPJsonArray kMPJsonArray = new KMPJsonArray(null, 1, null);
            if (jsonArray != null && jsonArray.size() > 0) {
                int size = jsonArray.size();
                for (int i = 0; i < size; i++) {
                    KMPJsonObject jsonObject = jsonArray.getJsonObject(i);
                    if (a(jsonObject, j)) {
                        kMPJsonArray.add(jsonObject);
                    }
                }
            }
            KMPJsonObject itemExtData2 = liveItem.getItemExtData();
            if (itemExtData2 == null) {
                return;
            }
            itemExtData2.put("itemBenefitLabels", (Object) kMPJsonArray);
        }
    }

    private final boolean a(KMPJsonObject kMPJsonObject, long j) {
        Long l;
        Long l2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1754d8a2", new Object[]{this, kMPJsonObject, new Long(j)})).booleanValue();
        }
        long j2 = -1;
        long longValue = (kMPJsonObject == null || (l2 = kMPJsonObject.getLong("showStartTime")) == null) ? -1L : l2.longValue();
        if (kMPJsonObject != null && (l = kMPJsonObject.getLong("showEndTime")) != null) {
            j2 = l.longValue();
        }
        if (j2 <= 0) {
            return true;
        }
        return longValue <= 0 ? j <= j2 : longValue + 1 <= j && j <= j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c6, code lost:
        if ((r6.length() == 0) == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(com.taobao.live.liveroom.good.model.LiveItem r9) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.liveroom.good.model.d.a(com.taobao.live.liveroom.good.model.LiveItem):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184a7913", new Object[]{obj, obj2})).intValue();
        }
        if (!(obj instanceof KMPJsonObject) || !(obj2 instanceof KMPJsonObject)) {
            return 0;
        }
        String string = ((KMPJsonObject) obj).getString("orderVal");
        int i = Integer.MAX_VALUE;
        int parseInt = string != null ? Integer.parseInt(string) : Integer.MAX_VALUE;
        String string2 = ((KMPJsonObject) obj2).getString("orderVal");
        if (string2 != null) {
            i = Integer.parseInt(string2);
        }
        return parseInt - i;
    }

    private final void a(f fVar, LiveItem liveItem) {
        String string;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f41003", new Object[]{this, fVar, liveItem});
        } else if (fVar == null || liveItem == null) {
        } else {
            KMPJsonObject extendVal = liveItem.getExtendVal();
            if (extendVal != null && (string = extendVal.getString("liveItemBizTags")) != null) {
                String str = string;
                liveItem.a(n.b((CharSequence) str, (CharSequence) "vipFirst", false, 2, (Object) null) || (n.b((CharSequence) str, (CharSequence) "vipBuyGift", false, 2, (Object) null) && fVar.e().g() != 0));
                if (!fVar.e().f() || ((!n.b((CharSequence) str, (CharSequence) "vipFirst", false, 2, (Object) null) && !n.b((CharSequence) str, (CharSequence) "vipBuyGift", false, 2, (Object) null)) || fVar.e().g() == 0 || fVar.d() || !fVar.e().e())) {
                    z = false;
                }
                liveItem.b(z);
                if (string != null) {
                    return;
                }
            }
            liveItem.a(false);
            liveItem.b(false);
            t tVar = t.INSTANCE;
        }
    }

    private final boolean a(KMPJsonArray kMPJsonArray, KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("234e2674", new Object[]{this, kMPJsonArray, kMPJsonObject})).booleanValue();
        }
        if (kMPJsonArray != null) {
            for (Object obj : kMPJsonArray.toList()) {
                if ((obj instanceof KMPJsonObject) && q.a((Object) kMPJsonObject.getString("type"), (Object) ((KMPJsonObject) obj).getString("type"))) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void b(LiveItem liveItem) {
        KMPJsonObject extendVal;
        String string;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d82c19", new Object[]{this, liveItem});
        } else if (liveItem == null || (extendVal = liveItem.getExtendVal()) == null || (string = extendVal.getString("timeMovingTypeInfo")) == null) {
        } else {
            if (string.length() <= 0) {
                z = false;
            }
            if (!z) {
                return;
            }
            Object a2 = a.a(b.Companion, string);
            KMPJsonObject kMPJsonObject = a2 instanceof KMPJsonObject ? (KMPJsonObject) a2 : null;
            if (kMPJsonObject == null || q.a((Object) kMPJsonObject.getString(String.valueOf(liveItem.a())), (Object) "1")) {
                return;
            }
            KMPJsonObject extendVal2 = liveItem.getExtendVal();
            if (extendVal2 != null) {
                extendVal2.put(aw.PARAM_PLAY_URL, (Object) null);
            }
            KMPJsonObject extendVal3 = liveItem.getExtendVal();
            if (extendVal3 == null) {
                return;
            }
            extendVal3.put("timeMovingPlayInfo", (Object) null);
        }
    }

    private final void a(LiveItem liveItem, boolean z) {
        long m2371constructorimpl;
        String string;
        KMPJsonObject itemExtData;
        KMPJsonObject itemExtData2;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6556f7c", new Object[]{this, liveItem, new Boolean(z)});
        } else if (!z) {
            if (liveItem == null || (itemExtData2 = liveItem.getItemExtData()) == null) {
                return;
            }
            itemExtData2.remove2("preSaleStatus");
        } else {
            Long l = null;
            if (!q.a((Object) ((liveItem == null || (itemExtData = liveItem.getItemExtData()) == null) ? null : itemExtData.getString("preSaleStatus")), (Object) "0")) {
                return;
            }
            try {
                Result.a aVar = Result.Companion;
                KMPJsonObject itemExtData3 = liveItem.getItemExtData();
                if (itemExtData3 != null && (string = itemExtData3.getString("depositBegin")) != null) {
                    l = Long.valueOf(Long.parseLong(string));
                }
                m2371constructorimpl = Result.m2371constructorimpl(l);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
            }
            long j = -1;
            if (Result.m2374exceptionOrNullimpl(m2371constructorimpl) != null) {
                m2371constructorimpl = -1L;
            }
            Long l2 = (Long) m2371constructorimpl;
            if (l2 != null) {
                j = l2.longValue();
            }
            if (j < 0) {
                return;
            }
            KMPJsonObject itemExtData4 = liveItem.getItemExtData();
            if (itemExtData4 != null && itemExtData4.containsKey("native_depositBegin")) {
                z2 = true;
            }
            if (z2) {
                return;
            }
            String a2 = trf.INSTANCE.a(j, "付定");
            KMPJsonObject itemExtData5 = liveItem.getItemExtData();
            if (itemExtData5 == null) {
                return;
            }
            itemExtData5.put("native_depositBegin", (Object) a2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
        if ((r1.length() == 0) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(com.taobao.live.liveroom.good.model.LiveItem r9) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.live.liveroom.good.model.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r2] = r9
            java.lang.String r9 = "4a6349da"
            r0.ipc$dispatch(r9, r1)
            return
        L15:
            if (r9 == 0) goto L97
            com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject r0 = r9.getItemExtData()
            if (r0 != 0) goto L1f
            goto L97
        L1f:
            com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject r0 = r9.getItemExtData()
            r1 = 0
            if (r0 == 0) goto L2e
            java.lang.String r4 = "timingUpShelfStatus"
            java.lang.String r0 = r0.getString(r4)
            goto L2f
        L2e:
            r0 = r1
        L2f:
            com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject r4 = r9.getItemExtData()
            if (r4 == 0) goto L43
            java.lang.String r5 = "timingStarts"
            java.lang.Long r4 = r4.getLong(r5)
            if (r4 == 0) goto L43
            long r4 = r4.longValue()
            goto L45
        L43:
            r4 = -1
        L45:
            java.lang.String r6 = "0"
            boolean r0 = kotlin.jvm.internal.q.a(r0, r6)
            if (r0 == 0) goto L97
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L54
            goto L97
        L54:
            com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject r0 = r9.getItemExtData()
            java.lang.String r6 = "native_timingStarts"
            if (r0 == 0) goto L60
            java.lang.String r1 = r0.getString(r6)
        L60:
            if (r1 == 0) goto L82
            boolean r0 = r1 instanceof java.lang.CharSequence
            if (r0 == 0) goto L74
            r0 = r1
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L71
            r0 = 1
            goto L72
        L71:
            r0 = 0
        L72:
            if (r0 != 0) goto L82
        L74:
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L81
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L81
            goto L82
        L81:
            r2 = 0
        L82:
            if (r2 != 0) goto L85
            return
        L85:
            tb.trf r0 = tb.trf.INSTANCE
            java.lang.String r1 = "开抢"
            java.lang.String r0 = r0.a(r4, r1)
            com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject r9 = r9.getItemExtData()
            if (r9 == 0) goto L97
            r9.put(r6, r0)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.liveroom.good.model.d.c(com.taobao.live.liveroom.good.model.LiveItem):void");
    }

    private final void b(f fVar, LiveItem liveItem) {
        e e;
        e e2;
        e e3;
        e e4;
        GoodLiveInfo a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce4eb22", new Object[]{this, fVar, liveItem});
        } else if (liveItem == null) {
        } else {
            Boolean bool = null;
            liveItem.setItemConfigInfo((fVar == null || (a2 = fVar.a()) == null) ? null : a2.getItemConfigInfo());
            if (liveItem.getNativeConfigInfos() == null) {
                liveItem.setNativeConfigInfos(new KMPJsonObject(null, 1, null));
            }
            KMPJsonObject nativeConfigInfos = liveItem.getNativeConfigInfos();
            if (nativeConfigInfos != null) {
                nativeConfigInfos.put("seckillPreheatAddCart", (Object) ((fVar == null || (e4 = fVar.e()) == null) ? null : Boolean.valueOf(e4.h())));
                nativeConfigInfos.put("newUserAddCart", "1");
                nativeConfigInfos.put("glPerformance", (Object) ((fVar == null || (e3 = fVar.e()) == null) ? null : Boolean.valueOf(e3.k())));
            }
            KMPJsonObject nativeConfigInfos2 = liveItem.getNativeConfigInfos();
            if (nativeConfigInfos2 == null) {
                return;
            }
            nativeConfigInfos2.put("seckillPreheatAddCart", (Object) ((fVar == null || (e2 = fVar.e()) == null) ? null : Boolean.valueOf(e2.h())));
            nativeConfigInfos2.put("newUserAddCart", "1");
            if (fVar != null && (e = fVar.e()) != null) {
                bool = Boolean.valueOf(e.k());
            }
            nativeConfigInfos2.put("glPerformance", (Object) bool);
        }
    }

    private final void a(LiveItem liveItem, f fVar, String str) {
        KMPJsonObject extendVal;
        String string;
        KMPJsonObject extendVal2;
        GoodLiveInfo a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c82186d", new Object[]{this, liveItem, fVar, str});
        } else if (liveItem == null) {
        } else {
            if (!tqh.INSTANCE.a((fVar == null || (a2 = fVar.a()) == null) ? null : a2.getItemTransferInfo())) {
                return;
            }
            KMPJsonObject extendVal3 = liveItem.getExtendVal();
            if (extendVal3 != null && (string = extendVal3.getString("tradeParamsForPcg")) != null) {
                if (string.length() <= 0) {
                    z = false;
                }
                if (z && (extendVal2 = liveItem.getExtendVal()) != null) {
                    extendVal2.put(string, "tradeParams");
                }
            }
            if (!q.a((Object) str, (Object) String.valueOf(liveItem.a())) || (extendVal = liveItem.getExtendVal()) == null) {
                return;
            }
            extendVal.put("true", "rec0");
        }
    }
}
