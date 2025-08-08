package com.taobao.message.sp.chat.handler;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.ext.ActionExtKt;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.PageService;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.message.lab.comfrm.support.UserIdentifier;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import com.taobao.message.sp.framework.service.ISimpleMessageService;
import com.taobao.message.sp.framework.service.SimpleMessageSender;
import com.taobao.message.sp.framework.service.SimpleServiceFactory;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/taobao/message/sp/chat/handler/SimpleSendTxtEventHandler;", "Lcom/taobao/message/lab/comfrm/inner2/EventHandler;", "Lcom/taobao/message/lab/comfrm/support/UserIdentifier;", "()V", "userIdentifier", "", "handle", "", "action", "Lcom/taobao/message/lab/comfrm/core/Action;", "actionDispatcher", "Lcom/taobao/message/lab/comfrm/core/ActionDispatcher;", "commandHandler", "Lcom/taobao/message/lab/comfrm/inner2/CommandHandler;", "serviceProvider", "Lcom/taobao/message/lab/comfrm/inner2/ServiceProvider;", "identifier", "notifySync", "message_sp_chat_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleSendTxtEventHandler implements EventHandler, UserIdentifier {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String userIdentifier;

    static {
        kge.a(-939438943);
        kge.a(778700337);
        kge.a(451726918);
    }

    public static final /* synthetic */ void access$notifySync(SimpleSendTxtEventHandler simpleSendTxtEventHandler, Action action, CommandHandler commandHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ee326d", new Object[]{simpleSendTxtEventHandler, action, commandHandler});
        } else {
            simpleSendTxtEventHandler.notifySync(action, commandHandler);
        }
    }

    @Override // com.taobao.message.lab.comfrm.support.UserIdentifier
    public void identifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee19127a", new Object[]{this, str});
        } else {
            this.userIdentifier = str;
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(final Action action, ActionDispatcher actionDispatcher, final CommandHandler commandHandler, final ServiceProvider serviceProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
            return;
        }
        q.c(action, "action");
        q.c(actionDispatcher, "actionDispatcher");
        q.c(commandHandler, "commandHandler");
        String stringFromData = ActionExtKt.getStringFromData(action, "text");
        String stringFromData2 = ActionExtKt.getStringFromData(action, "targetId");
        String stringFromData3 = ActionExtKt.getStringFromData(action, "targetNick");
        if (StringUtils.isEmpty(stringFromData)) {
            UIHandler.postMain(new Runnable() { // from class: com.taobao.message.sp.chat.handler.SimpleSendTxtEventHandler$handle$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    PageService pageService;
                    Activity activity;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ServiceProvider serviceProvider2 = ServiceProvider.this;
                    if (serviceProvider2 == null || (pageService = (PageService) serviceProvider2.service(PageService.class)) == null || (activity = pageService.getActivity()) == null) {
                        return;
                    }
                    if (!(!activity.isFinishing())) {
                        activity = null;
                    }
                    if (activity == null) {
                        return;
                    }
                    TBToast.makeText(activity, activity.getString(R.string.mp_send_empty_message)).show();
                }
            });
            return;
        }
        SimpleMessageSender simpleMessageSender = SimpleMessageSender.INSTANCE;
        if (stringFromData == null) {
            q.a();
        }
        String buildTextMessageBody = simpleMessageSender.buildTextMessageBody(stringFromData);
        if (!StringUtils.isEmpty(stringFromData3)) {
            String str = this.userIdentifier;
            if (str == null) {
                q.a();
            }
            ISimpleMessageService iSimpleMessageService = (ISimpleMessageService) SimpleServiceFactory.obtain(str, "im_bc", ISimpleMessageService.class);
            if (iSimpleMessageService == null) {
                return;
            }
            if (stringFromData3 == null) {
                q.a();
            }
            iSimpleMessageService.sendMessageByNick(stringFromData3, buildTextMessageBody, new IObserver<Boolean>() { // from class: com.taobao.message.sp.chat.handler.SimpleSendTxtEventHandler$handle$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public /* synthetic */ void onNext(Boolean bool) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b8495", new Object[]{this, bool});
                    } else {
                        onNext(bool.booleanValue());
                    }
                }

                public void onNext(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43e250fb", new Object[]{this, new Boolean(z)});
                    } else if (!z) {
                    } else {
                        SimpleSendTxtEventHandler.access$notifySync(SimpleSendTxtEventHandler.this, action, commandHandler);
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable it) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, it});
                        return;
                    }
                    q.c(it, "it");
                    TLog.loge("SimpleSendTxtEventHandler", Log.getStackTraceString(it));
                }
            });
            return;
        }
        String str2 = this.userIdentifier;
        if (str2 == null) {
            q.a();
        }
        ISimpleMessageService iSimpleMessageService2 = (ISimpleMessageService) SimpleServiceFactory.obtain(str2, "im_bc", ISimpleMessageService.class);
        if (iSimpleMessageService2 == null) {
            return;
        }
        if (stringFromData2 == null) {
            q.a();
        }
        iSimpleMessageService2.sendMessage(stringFromData2, buildTextMessageBody, new IObserver<Boolean>() { // from class: com.taobao.message.sp.chat.handler.SimpleSendTxtEventHandler$handle$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.kit.core.IObserver
            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                }
            }

            @Override // com.taobao.message.kit.core.IObserver
            public /* synthetic */ void onNext(Boolean bool) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4b8495", new Object[]{this, bool});
                } else {
                    onNext(bool.booleanValue());
                }
            }

            public void onNext(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("43e250fb", new Object[]{this, new Boolean(z)});
                } else if (!z) {
                } else {
                    SimpleSendTxtEventHandler.access$notifySync(SimpleSendTxtEventHandler.this, action, commandHandler);
                }
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onError(Throwable it) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, it});
                    return;
                }
                q.c(it, "it");
                TLog.loge("SimpleSendTxtEventHandler", Log.getStackTraceString(it));
            }
        });
    }

    private final void notifySync(final Action action, final CommandHandler commandHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4312b43f", new Object[]{this, action, commandHandler});
        } else {
            UIHandler.postDelayed(new Runnable() { // from class: com.taobao.message.sp.chat.handler.SimpleSendTxtEventHandler$notifySync$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        commandHandler.handle(new Command.Build(ActionExtKt.getStringFromData(Action.this, "sourceInstance"), SimpleMessageListData.SOURCE_NAME_MESSAGE, "syncMessage").build());
                    }
                }
            }, 100L);
        }
    }
}
