package com.taobao.infoflow.taobao.subservice.biz.carddebugmaskservice;

import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IAiCardDebugMaskService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.taobao.R;
import tb.kge;
import tb.lcz;
import tb.ldf;
import tb.ljs;
import tb.lkz;

/* loaded from: classes7.dex */
public class AiCardDebugMaskServiceImpl implements IAiCardDebugMaskService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEBUG_INFO = "debugInfo";
    private static final String TAG = "CardDebugMaskServiceImpl";
    private ljs mInfoFlowContext;
    private lkz.a onItemRenderListener;

    static {
        kge.a(1288193698);
        kge.a(1327653048);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean lambda$attachAiDebugInfoMask$4(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58b42111", new Object[]{view, motionEvent})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void access$000(AiCardDebugMaskServiceImpl aiCardDebugMaskServiceImpl, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cafb90a", new Object[]{aiCardDebugMaskServiceImpl, view});
        } else {
            aiCardDebugMaskServiceImpl.attachAiDebugInfoMask(view);
        }
    }

    public static /* synthetic */ void access$100(AiCardDebugMaskServiceImpl aiCardDebugMaskServiceImpl, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e55c253", new Object[]{aiCardDebugMaskServiceImpl, view, baseSectionModel});
        } else {
            aiCardDebugMaskServiceImpl.setAiDebugInfoMask(view, baseSectionModel);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mInfoFlowContext = ljsVar;
        ldf.d(TAG, "CardDebugMaskServiceImpl create");
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return;
        }
        this.onItemRenderListener = createItemLifeCycleListener();
        iMainFeedsViewService.mo1084getLifeCycleRegister().a(this.onItemRenderListener);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.mInfoFlowContext.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return;
        }
        iMainFeedsViewService.mo1084getLifeCycleRegister().b(this.onItemRenderListener);
        ldf.d(TAG, "CardDebugMaskServiceImpl onDestroy");
    }

    private lkz.a createItemLifeCycleListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lkz.a) ipChange.ipc$dispatch("b3ad7df8", new Object[]{this}) : new lkz.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.carddebugmaskservice.AiCardDebugMaskServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lkz.a
            public void a(int i, View view, BaseSectionModel baseSectionModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0524b1f", new Object[]{this, new Integer(i), view, baseSectionModel});
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
            public void a_(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b34bf30d", new Object[]{this, view});
                } else {
                    AiCardDebugMaskServiceImpl.access$000(AiCardDebugMaskServiceImpl.this, view);
                }
            }

            @Override // tb.lkz.a
            public void a(boolean z, int i, BaseSectionModel baseSectionModel, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ac4f93", new Object[]{this, new Boolean(z), new Integer(i), baseSectionModel, view});
                } else if (!z) {
                } else {
                    AiCardDebugMaskServiceImpl.access$100(AiCardDebugMaskServiceImpl.this, view, baseSectionModel);
                }
            }
        };
    }

    private void attachAiDebugInfoMask(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8891990b", new Object[]{this, view});
        } else if (!lcz.b()) {
        } else {
            TextView textView = (TextView) LayoutInflater.from(view.getContext()).inflate(R.layout.card_ai_debug_mask, (ViewGroup) null);
            textView.setOnTouchListener($$Lambda$AiCardDebugMaskServiceImpl$5u5OwFeqHTJ7ahM5t16rLa6bheM.INSTANCE);
            textView.setLayoutParams(view.getLayoutParams());
            ((ViewGroup) view.getParent()).addView(textView);
            textView.setId(R.id.debug_info_mask);
            textView.setVisibility(8);
            ldf.d(TAG, "bindDebugInfoData, attachMaskView:" + System.identityHashCode(textView));
        }
    }

    private void setAiDebugInfoMask(View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cc3aab0", new Object[]{this, view, baseSectionModel});
        } else if (!lcz.b()) {
        } else {
            TextView textView = (TextView) ((ViewGroup) view.getParent()).findViewById(R.id.debug_info_mask);
            String aiDebugInfoString = getAiDebugInfoString(baseSectionModel);
            ldf.d(TAG, "bindDebugInfoData, maskView:" + System.identityHashCode(textView) + ", debugInfoStr:" + aiDebugInfoString);
            if (textView == null) {
                return;
            }
            if (StringUtils.isEmpty(aiDebugInfoString)) {
                i = 8;
            }
            textView.setVisibility(i);
            if (StringUtils.isEmpty(aiDebugInfoString)) {
                return;
            }
            textView.setText(aiDebugInfoString);
        }
    }

    private String getAiDebugInfoString(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3860999d", new Object[]{this, baseSectionModel});
        }
        if (baseSectionModel == null || baseSectionModel.mo1096getExposureParam() == null || baseSectionModel.mo1096getExposureParam().getArgs() == null || baseSectionModel.mo1096getExposureParam().getArgs().getJSONObject(DEBUG_INFO) == null) {
            return "";
        }
        JSONObject jSONObject = baseSectionModel.mo1096getExposureParam().getArgs().getJSONObject(DEBUG_INFO);
        StringBuilder sb = new StringBuilder();
        for (String str : jSONObject.keySet()) {
            sb.append(str);
            sb.append(":");
            sb.append(jSONObject.get(str));
            sb.append("\n");
        }
        return sb.toString();
    }
}
