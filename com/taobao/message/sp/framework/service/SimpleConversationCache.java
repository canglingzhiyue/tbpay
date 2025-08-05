package com.taobao.message.sp.framework.service;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.model.SimpleConversation;
import com.taobao.message.sp.framework.model.SimpleConversationIdentifier;
import com.taobao.message.sp.framework.model.SimpleTarget;
import com.taobao.taolive.room.utils.aw;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rJ6\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015J6\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/taobao/message/sp/framework/service/SimpleConversationCache;", "", "()V", "cache", "", "", "Lcom/taobao/message/sp/framework/model/SimpleConversation;", "cacheByTargetId", "createdNick", "", "addData", "", "list", "", "fetch", "conversationCode", "channelType", "identifier", aw.PARAM_FORCE_REFRESH, "", "observer", "Lcom/taobao/message/kit/core/IObserver;", "fetchByTargetId", "targetId", "get", "getByTargetId", "isCreated", "nick", "markCreated", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleConversationCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SimpleConversationCache INSTANCE;
    private static final Map<String, SimpleConversation> cache;
    private static final Map<String, SimpleConversation> cacheByTargetId;
    private static final Set<String> createdNick;

    static {
        kge.a(-1145998805);
        INSTANCE = new SimpleConversationCache();
        cache = new LinkedHashMap();
        cacheByTargetId = new LinkedHashMap();
        createdNick = new LinkedHashSet();
    }

    private SimpleConversationCache() {
    }

    public final void markCreated(String nick) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4905b3ac", new Object[]{this, nick});
            return;
        }
        q.c(nick, "nick");
        createdNick.add(nick);
    }

    public final boolean isCreated(String nick) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6318c673", new Object[]{this, nick})).booleanValue();
        }
        q.c(nick, "nick");
        return createdNick.contains(nick);
    }

    public final void addData(List<? extends SimpleConversation> list) {
        String targetId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4ca3e3", new Object[]{this, list});
        } else if (list != null) {
            for (SimpleConversation simpleConversation : list) {
                Map<String, SimpleConversation> map = cache;
                String conversationCode = simpleConversation.getConversationCode();
                q.a((Object) conversationCode, "it.conversationCode");
                map.put(conversationCode, simpleConversation);
                SimpleConversationIdentifier conversationIdentifier = simpleConversation.getConversationIdentifier();
                q.a((Object) conversationIdentifier, "it.conversationIdentifier");
                SimpleTarget target = conversationIdentifier.getTarget();
                if (target != null && (targetId = target.getTargetId()) != null) {
                    cacheByTargetId.put(targetId, simpleConversation);
                }
            }
        }
    }

    public final SimpleConversation get(String conversationCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleConversation) ipChange.ipc$dispatch("c1d5313b", new Object[]{this, conversationCode});
        }
        q.c(conversationCode, "conversationCode");
        return cache.get(conversationCode);
    }

    public final SimpleConversation getByTargetId(String targetId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleConversation) ipChange.ipc$dispatch("f29e238", new Object[]{this, targetId});
        }
        q.c(targetId, "targetId");
        return cacheByTargetId.get(targetId);
    }

    public static /* synthetic */ void fetch$default(SimpleConversationCache simpleConversationCache, String str, String str2, String str3, boolean z, IObserver iObserver, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3277eff", new Object[]{simpleConversationCache, str, str2, str3, new Boolean(z), iObserver, new Integer(i), obj});
        } else {
            simpleConversationCache.fetch(str, str2, str3, (i & 8) != 0 ? false : z, iObserver);
        }
    }

    public final void fetch(final String conversationCode, String channelType, String identifier, boolean z, final IObserver<SimpleConversation> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbce789", new Object[]{this, conversationCode, channelType, identifier, new Boolean(z), observer});
            return;
        }
        q.c(conversationCode, "conversationCode");
        q.c(channelType, "channelType");
        q.c(identifier, "identifier");
        q.c(observer, "observer");
        SimpleConversation simpleConversation = get(conversationCode);
        if (simpleConversation == null) {
            if (z || cache.isEmpty()) {
                ISimpleConversationService iSimpleConversationService = (ISimpleConversationService) SimpleServiceFactory.obtain(identifier, channelType, ISimpleConversationService.class);
                if (iSimpleConversationService == null) {
                    return;
                }
                iSimpleConversationService.listConversations(200, (IObserver) new IObserver<List<? extends SimpleConversation>>() { // from class: com.taobao.message.sp.framework.service.SimpleConversationCache$fetch$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onNext(List<? extends SimpleConversation> p0) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6d15fbea", new Object[]{this, p0});
                        } else {
                            q.c(p0, "p0");
                        }
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                            return;
                        }
                        SimpleConversation simpleConversation2 = SimpleConversationCache.INSTANCE.get(conversationCode);
                        if (simpleConversation2 != null) {
                            observer.onNext(simpleConversation2);
                            observer.onComplete();
                            return;
                        }
                        observer.onError(new RuntimeException("no data!"));
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onError(Throwable p0) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, p0});
                            return;
                        }
                        q.c(p0, "p0");
                        observer.onError(p0);
                    }
                });
                return;
            }
            observer.onError(new RuntimeException("no data!"));
            return;
        }
        observer.onNext(simpleConversation);
        observer.onComplete();
    }

    public static /* synthetic */ void fetchByTargetId$default(SimpleConversationCache simpleConversationCache, String str, String str2, String str3, boolean z, IObserver iObserver, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb00362", new Object[]{simpleConversationCache, str, str2, str3, new Boolean(z), iObserver, new Integer(i), obj});
        } else {
            simpleConversationCache.fetchByTargetId(str, str2, str3, (i & 8) != 0 ? false : z, iObserver);
        }
    }

    public final void fetchByTargetId(final String targetId, String channelType, String identifier, boolean z, final IObserver<SimpleConversation> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcb666c", new Object[]{this, targetId, channelType, identifier, new Boolean(z), observer});
            return;
        }
        q.c(targetId, "targetId");
        q.c(channelType, "channelType");
        q.c(identifier, "identifier");
        q.c(observer, "observer");
        SimpleConversation byTargetId = getByTargetId(targetId);
        if (byTargetId == null) {
            if (z || cacheByTargetId.isEmpty()) {
                ISimpleConversationService iSimpleConversationService = (ISimpleConversationService) SimpleServiceFactory.obtain(identifier, channelType, ISimpleConversationService.class);
                if (iSimpleConversationService == null) {
                    return;
                }
                iSimpleConversationService.listConversations(200, (IObserver) new IObserver<List<? extends SimpleConversation>>() { // from class: com.taobao.message.sp.framework.service.SimpleConversationCache$fetchByTargetId$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onNext(List<? extends SimpleConversation> p0) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6d15fbea", new Object[]{this, p0});
                        } else {
                            q.c(p0, "p0");
                        }
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                            return;
                        }
                        SimpleConversation byTargetId2 = SimpleConversationCache.INSTANCE.getByTargetId(targetId);
                        if (byTargetId2 != null) {
                            observer.onNext(byTargetId2);
                            observer.onComplete();
                            return;
                        }
                        observer.onError(new RuntimeException("no data!"));
                    }

                    @Override // com.taobao.message.kit.core.IObserver
                    public void onError(Throwable p0) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, p0});
                            return;
                        }
                        q.c(p0, "p0");
                        observer.onError(new RuntimeException("no data!"));
                    }
                });
                return;
            }
            observer.onError(new RuntimeException("no data!"));
            return;
        }
        observer.onNext(byTargetId);
        observer.onComplete();
    }
}
