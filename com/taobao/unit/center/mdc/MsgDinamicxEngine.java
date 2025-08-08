package com.taobao.unit.center.mdc;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.bv;
import com.taobao.android.dinamicx.o;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView;
import com.taobao.message.kit.util.BizTagUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.features.internal.pullrefresh.CustomProgressBar;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserBetween;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpCopyList;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpCurrentThemeStatus;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpCurrentThemeStyle;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpCurrentTimestamp;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpGetBottomSafeAreaHeight;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpGetStatusBarHeight;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpIconFontValue;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpLongFormatTime;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpSplitAndGetSubString;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXDataParserMpWidgetSupported;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXTsKVDataParser;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParseElderFont;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParseFontSize;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParseFontSizeList;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParseInteractFormatNumber;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParseInteractFormatTime;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParseRelationOp;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParseUrlEncode;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DataParserMpFormatTime;
import com.taobao.unit.center.mdc.dinamicx.widget.DXMPMXMsgBoxFastTextWidgetNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.fut;
import tb.fxa;
import tb.kge;

/* loaded from: classes9.dex */
public class MsgDinamicxEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZTYPE = "alimp_message";
    public static final String DX_SUB_BIZTYPE_MESSAGE_CHAT = "message_chat";
    public static final String DX_SUB_BIZTYPE_MESSAGE_CHAT_COMMON;
    public static final String DX_SUB_BIZTYPE_MESSAGE_CHAT_COMPAT = "message_chat_compat";
    public static final String DX_SUB_BIZTYPE_MESSAGE_TAB = "message_tab";
    public static final String KEY_DX_SUB_BIZTYPE = "dxSubBizType";
    private static final String TAG = "MsgDinamicxEngine";
    private static final Map<Long, Class<? extends fut>> dxDataParserMap;
    private static final List<DXEngineProcessor> dxEngineProcessor;
    private static final Map<Long, Class<? extends bn>> dxEventHandler;
    private static final Map<Long, Class<? extends bn>> dxLowLevelEventHandler;
    private static final Map<Long, Class<? extends ak>> dxLowLevelWidgetMap;
    private static final Map<Long, Class<? extends ak>> dxWidgetMap;

    /* loaded from: classes9.dex */
    public interface DXEngineProcessor {
        void process(DinamicXEngine dinamicXEngine);
    }

    static {
        kge.a(452996711);
        DX_SUB_BIZTYPE_MESSAGE_CHAT_COMMON = null;
        dxWidgetMap = new HashMap();
        dxLowLevelWidgetMap = new HashMap();
        dxEventHandler = new HashMap();
        dxLowLevelEventHandler = new HashMap();
        dxDataParserMap = new HashMap();
        dxEngineProcessor = new ArrayList();
    }

    private MsgDinamicxEngine() {
    }

    public static void addProcessor(DXEngineProcessor dXEngineProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e2f08", new Object[]{dXEngineProcessor});
        } else if (dXEngineProcessor == null) {
        } else {
            dxEngineProcessor.add(dXEngineProcessor);
        }
    }

    public static void removeProcessor(DXEngineProcessor dXEngineProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("553e7005", new Object[]{dXEngineProcessor});
        } else if (dXEngineProcessor == null) {
        } else {
            dxEngineProcessor.remove(dXEngineProcessor);
        }
    }

    public static void registerWidget(long j, Class<? extends ak> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6bc2147", new Object[]{new Long(j), cls});
            return;
        }
        synchronized (MsgDinamicxEngine.class) {
            dxWidgetMap.put(Long.valueOf(j), cls);
        }
    }

    public static void registerLowLevelWidget(long j, Class<? extends ak> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e64c6f7", new Object[]{new Long(j), cls});
            return;
        }
        synchronized (MsgDinamicxEngine.class) {
            dxLowLevelWidgetMap.put(Long.valueOf(j), cls);
        }
    }

    public static void registerEventHandler(long j, Class<? extends bn> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d58f313", new Object[]{new Long(j), cls});
            return;
        }
        synchronized (MsgDinamicxEngine.class) {
            dxEventHandler.put(Long.valueOf(j), cls);
        }
    }

    public static void registerDataParseer(long j, Class<? extends fut> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47f2a73", new Object[]{new Long(j), cls});
            return;
        }
        synchronized (MsgDinamicxEngine.class) {
            dxDataParserMap.put(Long.valueOf(j), cls);
        }
    }

    public static void registerLowLevelEventHandler(long j, Class<? extends bn> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a94c3", new Object[]{new Long(j), cls});
            return;
        }
        synchronized (MsgDinamicxEngine.class) {
            dxLowLevelEventHandler.put(Long.valueOf(j), cls);
        }
    }

    public static DinamicXEngine createNewEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("a05599fa", new Object[0]) : createNewEngine(null, DX_SUB_BIZTYPE_MESSAGE_CHAT_COMPAT);
    }

    public static DinamicXEngine createNewEngine(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("a00654ac", new Object[]{context}) : createNewEngine(context, DX_SUB_BIZTYPE_MESSAGE_CHAT_COMPAT);
    }

    public static DinamicXEngine createNewEngine(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("c310b162", new Object[]{context, str}) : createNewEngine(context, str, BIZTYPE);
    }

    public static DinamicXEngine createNewEngine(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("69dd8c98", new Object[]{context, str, str2}) : createNewEngine(context, str, str2, false);
    }

    public static DinamicXEngine createNewEngine(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("8ca85642", new Object[]{context, str, str2, new Boolean(z)}) : createNewEngine(context, str, str2, null, -1, z);
    }

    public static DinamicXEngine createNewEngine(Context context, String str, String str2, BizTagUtil.BizTag bizTag, int i, boolean z) {
        Activity activityFromContext;
        if (bizTag == null) {
            bizTag = BizTagUtil.getBizTag(context);
        }
        DXEngineConfig.a aVar = new DXEngineConfig.a(str2);
        if (i > 0) {
            aVar.a(true);
            aVar.c(i);
        }
        if (z && !DisplayUtil.isLargeScreen(ApplicationUtil.getApplication())) {
            aVar.a(new bv() { // from class: com.taobao.unit.center.mdc.MsgDinamicxEngine.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.bv
                public int ap2Px(DinamicXEngine dinamicXEngine, Context context2, float f) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("207edfae", new Object[]{this, dinamicXEngine, context2, new Float(f)})).intValue() : DisplayUtil.dip2px(f);
                }

                @Override // com.taobao.android.dinamicx.bv
                public int px2Ap(DinamicXEngine dinamicXEngine, Context context2, float f) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d721afdc", new Object[]{this, dinamicXEngine, context2, new Float(f)})).intValue() : DisplayUtil.px2dip(context2, f);
                }
            });
        }
        if (!StringUtils.isEmpty(str)) {
            try {
                aVar.b(str);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else if (bizTag != null && !StringUtils.isEmpty(bizTag.dxSubBizType())) {
            try {
                aVar.b(str);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (DisplayUtil.isLargeScreen(context)) {
            aVar.a(true, true);
        }
        if (bizTag != null) {
            aVar.d(bizTag.bizId());
            aVar.a(bizTag.bizName());
        }
        try {
            aVar.h(true);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            aVar.a(new MsgContainerConfig());
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        DinamicXEngine dinamicXEngine = new DinamicXEngine(aVar.a());
        if (DisplayUtil.isLargeScreen(ApplicationUtil.getApplication()) && (activityFromContext = DisplayUtil.getActivityFromContext(context)) != null) {
            dinamicXEngine.a(activityFromContext);
        }
        synchronized (MsgDinamicxEngine.class) {
            for (Map.Entry<Long, Class<? extends ak>> entry : dxWidgetMap.entrySet()) {
                try {
                    dinamicXEngine.a(entry.getKey().longValue(), entry.getValue().newInstance());
                } catch (Throwable unused) {
                }
            }
            for (Map.Entry<Long, Class<? extends ak>> entry2 : dxLowLevelWidgetMap.entrySet()) {
                Class<? extends ak> cls = dxWidgetMap.get(entry2.getKey());
                if (cls == null) {
                    dinamicXEngine.a(entry2.getKey().longValue(), entry2.getValue().newInstance());
                } else {
                    dinamicXEngine.a(entry2.getKey().longValue(), cls.newInstance());
                }
            }
            for (Map.Entry<Long, Class<? extends bn>> entry3 : dxEventHandler.entrySet()) {
                dinamicXEngine.a(entry3.getKey().longValue(), entry3.getValue().newInstance());
            }
            for (Map.Entry<Long, Class<? extends bn>> entry4 : dxLowLevelEventHandler.entrySet()) {
                Class<? extends bn> cls2 = dxLowLevelEventHandler.get(entry4.getKey());
                if (cls2 == null) {
                    dinamicXEngine.a(entry4.getKey().longValue(), entry4.getValue().newInstance());
                } else {
                    dinamicXEngine.a(entry4.getKey().longValue(), cls2.newInstance());
                }
            }
        }
        for (DXEngineProcessor dXEngineProcessor : dxEngineProcessor) {
            if (dXEngineProcessor != null) {
                dXEngineProcessor.process(dinamicXEngine);
            }
        }
        setupDXEngine(dinamicXEngine);
        return dinamicXEngine;
    }

    public static void setupDXEngine(DinamicXEngine dinamicXEngine) {
        dinamicXEngine.a(fxa.a("relationOp"), new DataParseRelationOp());
        dinamicXEngine.a(fxa.a("mpSplitAndGetSubString"), new DXDataParserMpSplitAndGetSubString());
        dinamicXEngine.a(fxa.a("mpFormatTime"), new DataParserMpFormatTime());
        dinamicXEngine.a(fxa.a("mpLongFormatTime"), new DXDataParserMpLongFormatTime());
        dinamicXEngine.a(fxa.a("mpUrlEncode"), new DataParseUrlEncode());
        dinamicXEngine.a(fxa.a("mpCurrentTimestamp"), new DXDataParserMpCurrentTimestamp());
        dinamicXEngine.a(fxa.a("mpWidgetSupported"), new DXDataParserMpWidgetSupported());
        dinamicXEngine.a(fxa.a("mpInteractNumberFormat"), new DataParseInteractFormatNumber());
        dinamicXEngine.a(fxa.a("mpInteractFormatTime"), new DataParseInteractFormatTime());
        dinamicXEngine.a(fxa.a("mpElderFont"), new DataParseElderFont());
        dinamicXEngine.a(fxa.a("imAdaptiveFontSize"), new DataParseFontSize());
        dinamicXEngine.a(fxa.a("imAdaptiveFontSizeList"), new DataParseFontSizeList());
        dinamicXEngine.a(fxa.a("mpIconFontValue"), DXDataParserMpIconFontValue.INSTANCE);
        dinamicXEngine.a(fxa.a("mpGetBottomSafeAreaHeight"), new DXDataParserMpGetBottomSafeAreaHeight());
        dinamicXEngine.a(fxa.a("mpGetStatusBarHeight"), new DXDataParserMpGetStatusBarHeight());
        dinamicXEngine.a(DXDataParserMpCopyList.DX_PARSER_MPCOPYLIST, new DXDataParserMpCopyList());
        dinamicXEngine.a(DXDataParserBetween.DX_PARSER_BETWEEN, new DXDataParserBetween());
        dinamicXEngine.a(DXDataParserMpCurrentThemeStatus.DX_PARSER_MPCURRENTTHEMESTATUS, new DXDataParserMpCurrentThemeStatus());
        dinamicXEngine.a(DXDataParserMpCurrentThemeStyle.DX_PARSER_MPCURRENTTHEMESTYLE, new DXDataParserMpCurrentThemeStyle());
        dinamicXEngine.a(DXMPMXMsgBoxFastTextWidgetNode.DXMPMXMSGBOXFASTTEXT_MPMXMSGBOXFASTTEXT, new DXMPMXMsgBoxFastTextWidgetNode.Builder());
        dinamicXEngine.a(DXTsKVDataParser.DX_PARSER_TSKV, new DXTsKVDataParser());
        synchronized (MsgDinamicxEngine.class) {
            for (Map.Entry<Long, Class<? extends fut>> entry : dxDataParserMap.entrySet()) {
                try {
                    dinamicXEngine.a(entry.getKey().longValue(), entry.getValue().newInstance());
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class MsgContainerConfig extends o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(386622175);
        }

        @Override // com.taobao.android.dinamicx.o
        public DXAbsOnLoadMoreView getOnRefreshLoadMoreView(Context context, String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXAbsOnLoadMoreView) ipChange.ipc$dispatch("ce97201f", new Object[]{this, context, str}) : new MyDXAbsOnLoadMoreView(context);
        }
    }

    /* loaded from: classes9.dex */
    public static class MyDXAbsOnLoadMoreView extends DXAbsOnLoadMoreView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View viewGroup;

        static {
            kge.a(-1379930828);
        }

        public MyDXAbsOnLoadMoreView(Context context) {
            super(context);
        }

        @Override // com.taobao.android.dinamicx.widget.recycler.loadmore.DXAbsOnLoadMoreView
        public void onLoadMoreStatusUpdate(int i, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49b6d829", new Object[]{this, new Integer(i), jSONObject});
            } else if (i == 2) {
                if (this.viewGroup == null) {
                    this.viewGroup = LayoutInflater.from(getContext()).inflate(R.layout.mp_chat_item_msg_loading, (ViewGroup) null);
                    ((CustomProgressBar) this.viewGroup.findViewById(R.id.msg_loading)).startLoadingAnimaton();
                    addView(this.viewGroup);
                }
                setVisibility(0);
            } else {
                setVisibility(8);
            }
        }
    }
}
