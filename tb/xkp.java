package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* loaded from: classes7.dex */
public class xkp extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_OPENHOSTTARGETURLHANDLER = -7373714118674621824L;

    /* renamed from: a  reason: collision with root package name */
    private lds f34355a;

    static {
        kge.a(-1591107427);
    }

    public static /* synthetic */ Object ipc$super(xkp xkpVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        ljs a2;
        ICardOverlayService iCardOverlayService;
        BaseSectionModel<?> findHostCard;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        BaseSectionModel<?> baseSectionModel = (BaseSectionModel) dXRuntimeContext.e();
        if (baseSectionModel == null || (a2 = lfq.a(dXRuntimeContext)) == null || (iCardOverlayService = (ICardOverlayService) a2.a(ICardOverlayService.class)) == null || (findHostCard = iCardOverlayService.findHostCard(baseSectionModel)) == null || findHostCard.mo1097getItem() == null) {
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) a2.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService.findItemViewByPosition(iMainFeedsViewService.getPositionBySectionBizCode(findHostCard.getSectionBizCode())) == null) {
            return;
        }
        BaseSubItemModel mo1094getBaseItemModel = findHostCard.mo1097getItem().mo1094getBaseItemModel(0);
        if (mo1094getBaseItemModel == null) {
            ldf.d("DXOpenHostTargetURLHandlerEventHandler", "subItemModel == null");
            return;
        }
        ljh.a(findHostCard, mo1094getBaseItemModel);
        a(a2).a(findHostCard, mo1094getBaseItemModel, dXRuntimeContext.s());
    }

    public lds a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lds) ipChange.ipc$dispatch("ac9ca688", new Object[]{this, ljsVar});
        }
        if (this.f34355a == null) {
            this.f34355a = new ldv(ljsVar);
        }
        return this.f34355a;
    }
}
