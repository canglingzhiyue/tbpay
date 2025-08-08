package com.taobao.message.sp.chat.source;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chatv2.viewcenter.ITemplateService;
import com.taobao.message.chatv2.viewcenter.TemplateInfoServiceImpl;
import com.taobao.message.chatv2.viewcenter.config.LayoutInfo;
import com.taobao.message.datasdk.facade.model.ResultData;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Source;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.support.UserIdentifier;
import com.taobao.message.launcher.server_time.AmpTimeStampManager;
import com.taobao.message.sp.chat.transformer.SimpleMessageSenderViewDataTransformer;
import com.taobao.message.sp.framework.model.SimpleMessage;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import com.taobao.message.sp.framework.model.SimpleMessageListResult;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.message.sp.framework.model.SimpleTarget;
import com.taobao.message.sp.framework.service.ISimpleMessageService;
import com.taobao.message.sp.framework.service.SimpleServiceFactory;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ao;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J@\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u001bH\u0016J\u0010\u0010\u0005\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u0006H\u0016J8\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u00062\f\u0010+\u001a\b\u0012\u0004\u0012\u00020!0,H\u0002J\u0010\u0010-\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020#H\u0016J.\u0010.\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u00062\f\u0010+\u001a\b\u0012\u0004\u0012\u00020!0,H\u0002J\u001e\u0010/\u001a\u0004\u0018\u00010\u00022\b\u0010%\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u00010\u0002H\u0016J.\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u0002042\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\"\u001a\u00020#H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/taobao/message/sp/chat/source/SimpleMessageListSource;", "Lcom/taobao/message/lab/comfrm/inner2/Source;", "Lcom/taobao/message/sp/framework/model/SimpleMessageListData;", "Lcom/taobao/message/lab/comfrm/support/UserIdentifier;", "()V", "identifier", "", "isLoading", "", "mCursor", "", "mProps", "", "", "mRunnable", "Ljava/lang/Runnable;", "mSelfProfile", "Lcom/taobao/message/sp/framework/model/SimpleProfile;", "mTargetProfile", "mTerminal", "mTotalCount", "", "mWhiteLayoutSet", "", "viewCenterService", "Lcom/taobao/message/chatv2/viewcenter/ITemplateService;", "dispatchAction", "", "syncReason", "targetNick", "accountId", "entityType", "result", "Lcom/taobao/message/sp/framework/model/SimpleMessageListResult;", "actionDispatcher", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "p0", "loadMessages", "id", "isNick", "channelType", "ccode", "observer", "Lcom/taobao/message/kit/core/IObserver;", "subscribe", "syncMessages", "updateOriginalData", "Lcom/taobao/message/lab/comfrm/core/Action;", p1.d, "use", "command", "Lcom/taobao/message/lab/comfrm/inner2/Command;", "props", "message_sp_chat_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleMessageListSource implements Source<SimpleMessageListData>, UserIdentifier {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String identifier;
    private boolean isLoading;
    private long mCursor;
    private Map<String, Object> mProps;
    private Runnable mRunnable;
    private SimpleProfile mSelfProfile;
    private SimpleProfile mTargetProfile;
    private boolean mTerminal;
    private int mTotalCount;
    private final ITemplateService viewCenterService = new TemplateInfoServiceImpl();
    private final Set<String> mWhiteLayoutSet = ao.a((Object[]) new String[]{"widget.message.common.text", "widget.message.common.image", "widget.message.common.video", "widget.message.common.system"});

    static {
        kge.a(-989116678);
        kge.a(-915263556);
        kge.a(451726918);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public SimpleMessageListData updateOriginalData(Action action, SimpleMessageListData simpleMessageListData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleMessageListData) ipChange.ipc$dispatch("a9837232", new Object[]{this, action, simpleMessageListData}) : simpleMessageListData;
    }

    public static final /* synthetic */ void access$dispatchAction(SimpleMessageListSource simpleMessageListSource, String str, String str2, String str3, String str4, SimpleMessageListResult simpleMessageListResult, ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61580df", new Object[]{simpleMessageListSource, str, str2, str3, str4, simpleMessageListResult, actionDispatcher});
        } else {
            simpleMessageListSource.dispatchAction(str, str2, str3, str4, simpleMessageListResult, actionDispatcher);
        }
    }

    public static final /* synthetic */ Map access$getMProps$p(SimpleMessageListSource simpleMessageListSource) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d78d0370", new Object[]{simpleMessageListSource}) : simpleMessageListSource.mProps;
    }

    public static final /* synthetic */ Runnable access$getMRunnable$p(SimpleMessageListSource simpleMessageListSource) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("cde57834", new Object[]{simpleMessageListSource}) : simpleMessageListSource.mRunnable;
    }

    public static final /* synthetic */ boolean access$getMTerminal$p(SimpleMessageListSource simpleMessageListSource) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7c995e5", new Object[]{simpleMessageListSource})).booleanValue() : simpleMessageListSource.mTerminal;
    }

    public static final /* synthetic */ int access$getMTotalCount$p(SimpleMessageListSource simpleMessageListSource) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8f9357c5", new Object[]{simpleMessageListSource})).intValue() : simpleMessageListSource.mTotalCount;
    }

    public static final /* synthetic */ void access$setLoading$p(SimpleMessageListSource simpleMessageListSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2d827a", new Object[]{simpleMessageListSource, new Boolean(z)});
        } else {
            simpleMessageListSource.isLoading = z;
        }
    }

    public static final /* synthetic */ void access$setMProps$p(SimpleMessageListSource simpleMessageListSource, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe324db6", new Object[]{simpleMessageListSource, map});
        } else {
            simpleMessageListSource.mProps = map;
        }
    }

    public static final /* synthetic */ void access$setMRunnable$p(SimpleMessageListSource simpleMessageListSource, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdcdbea", new Object[]{simpleMessageListSource, runnable});
        } else {
            simpleMessageListSource.mRunnable = runnable;
        }
    }

    public static final /* synthetic */ void access$setMTerminal$p(SimpleMessageListSource simpleMessageListSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d79ac87", new Object[]{simpleMessageListSource, new Boolean(z)});
        } else {
            simpleMessageListSource.mTerminal = z;
        }
    }

    public static final /* synthetic */ void access$setMTotalCount$p(SimpleMessageListSource simpleMessageListSource, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca40dbe5", new Object[]{simpleMessageListSource, new Integer(i)});
        } else {
            simpleMessageListSource.mTotalCount = i;
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void subscribe(final ActionDispatcher p0) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c519475", new Object[]{this, p0});
            return;
        }
        q.c(p0, "p0");
        String value = ConfigUtil.getValue("mpm_data_switch", "durationIntervalSyncMsg", "30");
        q.a((Object) value, "ConfigUtil.getValue(\"mpm…onIntervalSyncMsg\", \"30\")");
        final long parseLong = Long.parseLong(value);
        if (!q.a((Object) "1", (Object) ConfigUtil.getValue("mpm_data_switch", "useIntervalSyncMsg", "1"))) {
            return;
        }
        this.mRunnable = new Runnable() { // from class: com.taobao.message.sp.chat.source.SimpleMessageListSource$subscribe$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TLog.loge("SimpleMessageListSource", "do loop request");
                if (SimpleMessageListSource.access$getMProps$p(SimpleMessageListSource.this) == null) {
                    return;
                }
                Command command = new Command.Build(null, SimpleMessageListData.SOURCE_NAME_MESSAGE, "syncMessage").build();
                SimpleMessageListSource simpleMessageListSource = SimpleMessageListSource.this;
                q.a((Object) command, "command");
                simpleMessageListSource.use(command, SimpleMessageListSource.access$getMProps$p(SimpleMessageListSource.this), p0);
                synchronized (SimpleMessageListSource.this) {
                    if (SimpleMessageListSource.access$getMRunnable$p(SimpleMessageListSource.this) != null && !SimpleMessageListSource.access$getMTerminal$p(SimpleMessageListSource.this)) {
                        UIHandler.postDelayed(SimpleMessageListSource.access$getMRunnable$p(SimpleMessageListSource.this), parseLong * 1000);
                    }
                    t tVar = t.INSTANCE;
                }
            }
        };
        synchronized (this) {
            if (this.mRunnable != null && !this.mTerminal) {
                UIHandler.postDelayed(this.mRunnable, parseLong * 1000);
            }
            t tVar = t.INSTANCE;
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        synchronized (this) {
            this.mTerminal = true;
            Runnable runnable = this.mRunnable;
            if (runnable != null) {
                TLog.loge("SimpleMessageListSource", "end loop request");
                UIHandler.removeCallbacks(runnable);
                this.mRunnable = null;
                t tVar = t.INSTANCE;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.taobao.message.sp.framework.model.SimpleMessageListResult, T] */
    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void use(Command command, Map<String, Object> map, final ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c59d34", new Object[]{this, command, map, actionDispatcher});
            return;
        }
        q.c(command, "command");
        q.c(actionDispatcher, "actionDispatcher");
        this.mProps = map;
        String channelType = ValueUtil.getString(map, "channelType");
        final String string = ValueUtil.getString(map, "targetNick");
        String string2 = ValueUtil.getString(map, "targetId");
        final String string3 = ValueUtil.getString(map, "accountId");
        final String string4 = ValueUtil.getString(map, "entityType");
        String string5 = ValueUtil.getString(map, "ccode");
        boolean z = !StringUtils.isEmpty(string);
        String id = z ? string : string2;
        if (map == null) {
            q.a();
        }
        if (map.get("selfProfile") instanceof SimpleProfile) {
            Object obj = map.get("selfProfile");
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.message.sp.framework.model.SimpleProfile");
            }
            this.mSelfProfile = (SimpleProfile) obj;
        }
        if (map.get("targetProfile") instanceof SimpleProfile) {
            Object obj2 = map.get("targetProfile");
            if (obj2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.message.sp.framework.model.SimpleProfile");
            }
            this.mTargetProfile = (SimpleProfile) obj2;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (SimpleMessageListResult) 0;
        if (q.a((Object) StdActions.COMMAND_INIT_SOURCE, (Object) command.getName())) {
            q.a((Object) id, "id");
            q.a((Object) channelType, "channelType");
            loadMessages(id, z, channelType, string5, new IObserver<SimpleMessageListResult>() { // from class: com.taobao.message.sp.chat.source.SimpleMessageListSource$use$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                        return;
                    }
                    SimpleMessageListResult simpleMessageListResult = (SimpleMessageListResult) objectRef.element;
                    if (simpleMessageListResult == null) {
                        return;
                    }
                    SimpleMessageListSource.access$dispatchAction(SimpleMessageListSource.this, null, string, string3, string4, simpleMessageListResult, actionDispatcher);
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onNext(SimpleMessageListResult it) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56510506", new Object[]{this, it});
                        return;
                    }
                    q.c(it, "it");
                    objectRef.element = it;
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable p0) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, p0});
                        return;
                    }
                    q.c(p0, "p0");
                    SimpleMessageListResult simpleMessageListResult = new SimpleMessageListResult();
                    simpleMessageListResult.messageList = new ArrayList();
                    SimpleMessageListSource.access$dispatchAction(SimpleMessageListSource.this, null, string, string3, string4, simpleMessageListResult, actionDispatcher);
                }
            });
        } else if (q.a((Object) "loadMessage", (Object) command.getName())) {
            if (!(command.getData() instanceof JSONObject) || this.isLoading) {
                return;
            }
            this.isLoading = true;
            Object data = command.getData();
            if (data == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            if (!q.a((Object) "1", ((JSONObject) data).get("fetchType"))) {
                return;
            }
            q.a((Object) id, "id");
            q.a((Object) channelType, "channelType");
            loadMessages(id, z, channelType, string5, new IObserver<SimpleMessageListResult>() { // from class: com.taobao.message.sp.chat.source.SimpleMessageListSource$use$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                        return;
                    }
                    SimpleMessageListSource.access$setLoading$p(SimpleMessageListSource.this, false);
                    SimpleMessageListResult simpleMessageListResult = (SimpleMessageListResult) objectRef.element;
                    if (simpleMessageListResult == null) {
                        return;
                    }
                    SimpleMessageListSource.access$dispatchAction(SimpleMessageListSource.this, null, string, string3, string4, simpleMessageListResult, actionDispatcher);
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onNext(SimpleMessageListResult it) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56510506", new Object[]{this, it});
                        return;
                    }
                    q.c(it, "it");
                    objectRef.element = it;
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable p0) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, p0});
                        return;
                    }
                    q.c(p0, "p0");
                    SimpleMessageListResult simpleMessageListResult = new SimpleMessageListResult();
                    simpleMessageListResult.messageList = new ArrayList();
                    SimpleMessageListSource.access$setLoading$p(SimpleMessageListSource.this, false);
                    SimpleMessageListSource.access$dispatchAction(SimpleMessageListSource.this, null, string, string3, string4, simpleMessageListResult, actionDispatcher);
                }
            });
        } else if (!q.a((Object) "syncMessage", (Object) command.getName()) || this.isLoading) {
        } else {
            q.a((Object) id, "id");
            q.a((Object) channelType, "channelType");
            syncMessages(id, z, channelType, new IObserver<SimpleMessageListResult>() { // from class: com.taobao.message.sp.chat.source.SimpleMessageListSource$use$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                        return;
                    }
                    SimpleMessageListSource.access$setLoading$p(SimpleMessageListSource.this, false);
                    SimpleMessageListResult simpleMessageListResult = (SimpleMessageListResult) objectRef.element;
                    if (simpleMessageListResult == null) {
                        return;
                    }
                    SimpleMessageListSource.access$dispatchAction(SimpleMessageListSource.this, SimpleMessageListData.REASON_SEND, string, string3, string4, simpleMessageListResult, actionDispatcher);
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onNext(SimpleMessageListResult p0) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56510506", new Object[]{this, p0});
                        return;
                    }
                    q.c(p0, "p0");
                    objectRef.element = p0;
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable p0) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, p0});
                        return;
                    }
                    q.c(p0, "p0");
                    SimpleMessageListResult simpleMessageListResult = new SimpleMessageListResult();
                    simpleMessageListResult.messageList = new ArrayList();
                    SimpleMessageListSource.access$setLoading$p(SimpleMessageListSource.this, false);
                    SimpleMessageListSource.access$dispatchAction(SimpleMessageListSource.this, SimpleMessageListData.REASON_SEND, string, string3, string4, simpleMessageListResult, actionDispatcher);
                }
            });
        }
    }

    private final void dispatchAction(String str, String str2, String str3, String str4, SimpleMessageListResult simpleMessageListResult, ActionDispatcher actionDispatcher) {
        LayoutInfo layoutInfo;
        IpChange ipChange = $ipChange;
        int i = 3;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a03a466", new Object[]{this, str, str2, str3, str4, simpleMessageListResult, actionDispatcher});
            return;
        }
        SimpleMessageListData simpleMessageListData = new SimpleMessageListData();
        simpleMessageListData.list = new ArrayList();
        simpleMessageListData.oldHasMore = simpleMessageListResult.hasMore;
        simpleMessageListData.reason = str;
        if (StringUtils.isEmpty(str)) {
            i = 0;
        }
        simpleMessageListData.changeType = i;
        this.mCursor = simpleMessageListResult.nextCursor;
        List<SimpleMessage> list = simpleMessageListResult.messageList;
        if (list != null) {
            for (SimpleMessage it : list) {
                RenderTemplate renderTemplate = null;
                try {
                    ITemplateService iTemplateService = this.viewCenterService;
                    q.a((Object) it, "it");
                    layoutInfo = iTemplateService.getLayoutInfo(it.getMsgType(), null);
                } catch (Throwable unused) {
                    layoutInfo = null;
                }
                if (layoutInfo != null) {
                    renderTemplate = layoutInfo.renderTemplate;
                }
                if (renderTemplate == null || !q.a((Object) "native", (Object) layoutInfo.renderTemplate.renderType) || this.mWhiteLayoutSet.contains(layoutInfo.renderTemplate.name)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("layoutInfo", layoutInfo);
                    q.a((Object) it, "it");
                    SimpleTarget sender = it.getSender();
                    q.a((Object) sender, "it.sender");
                    linkedHashMap.put("profile", SimpleMessageSenderViewDataTransformer.getHeadType(str2, sender.getTargetId(), str3, str4) == 1 ? this.mTargetProfile : this.mSelfProfile);
                    simpleMessageListData.list.add(new ResultData<>(it, linkedHashMap));
                    if (layoutInfo == null) {
                        TLog.loge("SimpleMessageListSource", "layoutInfo is null: " + it.getMsgType());
                    }
                }
            }
        }
        actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(simpleMessageListData).build());
    }

    private final void loadMessages(String str, boolean z, String str2, String str3, final IObserver<SimpleMessageListResult> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b72479", new Object[]{this, str, new Boolean(z), str2, str3, iObserver});
            return;
        }
        IObserver<SimpleMessageListResult> iObserver2 = new IObserver<SimpleMessageListResult>() { // from class: com.taobao.message.sp.chat.source.SimpleMessageListSource$loadMessages$myObserver$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.kit.core.IObserver
            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                } else {
                    iObserver.onComplete();
                }
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onNext(SimpleMessageListResult p0) {
                IpChange ipChange2 = $ipChange;
                int i = 0;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56510506", new Object[]{this, p0});
                    return;
                }
                q.c(p0, "p0");
                SimpleMessageListSource simpleMessageListSource = SimpleMessageListSource.this;
                int access$getMTotalCount$p = SimpleMessageListSource.access$getMTotalCount$p(simpleMessageListSource);
                if (p0.messageList != null) {
                    i = p0.messageList.size();
                }
                SimpleMessageListSource.access$setMTotalCount$p(simpleMessageListSource, access$getMTotalCount$p + i);
                iObserver.onNext(p0);
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onError(Throwable p0) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, p0});
                    return;
                }
                q.c(p0, "p0");
                iObserver.onError(p0);
            }
        };
        if (q.a((Object) str2, (Object) "imba")) {
            String str4 = this.identifier;
            if (str4 == null) {
                q.b("identifier");
            }
            ISimpleMessageService iSimpleMessageService = (ISimpleMessageService) SimpleServiceFactory.obtain(str4, str2, ISimpleMessageService.class);
            if (iSimpleMessageService == null) {
                return;
            }
            if (str3 == null) {
                q.a();
            }
            iSimpleMessageService.listMessagesByCCode(str3, this.mCursor, false, 20, iObserver2);
        } else if (z) {
            String str5 = this.identifier;
            if (str5 == null) {
                q.b("identifier");
            }
            ISimpleMessageService iSimpleMessageService2 = (ISimpleMessageService) SimpleServiceFactory.obtain(str5, str2, ISimpleMessageService.class);
            if (iSimpleMessageService2 == null) {
                return;
            }
            iSimpleMessageService2.listMessagesByNick(str, this.mCursor, false, 20, iObserver2);
        } else {
            String str6 = this.identifier;
            if (str6 == null) {
                q.b("identifier");
            }
            ISimpleMessageService iSimpleMessageService3 = (ISimpleMessageService) SimpleServiceFactory.obtain(str6, str2, ISimpleMessageService.class);
            if (iSimpleMessageService3 == null) {
                return;
            }
            iSimpleMessageService3.listMessages(str, this.mCursor, false, 20, iObserver2);
        }
    }

    private final void syncMessages(String str, boolean z, String str2, IObserver<SimpleMessageListResult> iObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7922378", new Object[]{this, str, new Boolean(z), str2, iObserver});
        } else if (z) {
            String str3 = this.identifier;
            if (str3 == null) {
                q.b("identifier");
            }
            ISimpleMessageService iSimpleMessageService = (ISimpleMessageService) SimpleServiceFactory.obtain(str3, str2, ISimpleMessageService.class);
            if (iSimpleMessageService == null) {
                return;
            }
            AmpTimeStampManager instance = AmpTimeStampManager.instance();
            q.a((Object) instance, "AmpTimeStampManager.instance()");
            iSimpleMessageService.listMessagesByNick(str, instance.getCurrentTimeStamp() + 1000, false, this.mTotalCount, iObserver);
        } else {
            String str4 = this.identifier;
            if (str4 == null) {
                q.b("identifier");
            }
            ISimpleMessageService iSimpleMessageService2 = (ISimpleMessageService) SimpleServiceFactory.obtain(str4, str2, ISimpleMessageService.class);
            if (iSimpleMessageService2 == null) {
                return;
            }
            AmpTimeStampManager instance2 = AmpTimeStampManager.instance();
            q.a((Object) instance2, "AmpTimeStampManager.instance()");
            iSimpleMessageService2.listMessages(str, instance2.getCurrentTimeStamp() + 1000, false, this.mTotalCount, iObserver);
        }
    }

    @Override // com.taobao.message.lab.comfrm.support.UserIdentifier
    public void identifier(String p0) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee19127a", new Object[]{this, p0});
            return;
        }
        q.c(p0, "p0");
        this.identifier = p0;
    }
}
