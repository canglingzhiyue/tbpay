package com.taobao.message.sp.framework.service;

import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.message.sp.framework.model.SimpleTarget;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u0014\u0010\b\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ<\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/taobao/message/sp/framework/service/SimpleProfileCache;", "", "()V", "cache", "", "", "Lcom/taobao/message/sp/framework/model/SimpleProfile;", "cacheByNick", "add", "", AdvanceSetting.NETWORK_TYPE, "list", "", "fetch", "targetId", "isNick", "", "identifier", "channelType", "bizType", "observer", "Lcom/taobao/message/kit/core/IObserver;", "get", "getByNick", "nick", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleProfileCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SimpleProfileCache INSTANCE;
    private static final Map<String, SimpleProfile> cache;
    private static final Map<String, SimpleProfile> cacheByNick;

    static {
        kge.a(-1659244947);
        INSTANCE = new SimpleProfileCache();
        cache = new LinkedHashMap();
        cacheByNick = new LinkedHashMap();
    }

    private SimpleProfileCache() {
    }

    public final SimpleProfile get(String targetId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleProfile) ipChange.ipc$dispatch("7b0444af", new Object[]{this, targetId});
        }
        q.c(targetId, "targetId");
        return cache.get(targetId);
    }

    public final SimpleProfile getByNick(String nick) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleProfile) ipChange.ipc$dispatch("e69bec29", new Object[]{this, nick});
        }
        q.c(nick, "nick");
        return cacheByNick.get(nick);
    }

    public final void fetch(String targetId, boolean z, String identifier, String channelType, String bizType, final IObserver<SimpleProfile> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb758117", new Object[]{this, targetId, new Boolean(z), identifier, channelType, bizType, observer});
            return;
        }
        q.c(targetId, "targetId");
        q.c(identifier, "identifier");
        q.c(channelType, "channelType");
        q.c(bizType, "bizType");
        q.c(observer, "observer");
        SimpleProfile simpleProfile = (z ? cacheByNick : cache).get(targetId);
        if (simpleProfile != null) {
            observer.onNext(simpleProfile);
            observer.onComplete();
        } else if (z) {
            ISimpleDataService obtain = SimpleServiceFactory.obtain(identifier, channelType, ISimpleProfileService.class);
            if (obtain == null) {
                q.a();
            }
            List<String> singletonList = Collections.singletonList(targetId);
            q.a((Object) singletonList, "Collections.singletonList(targetId)");
            ((ISimpleProfileService) obtain).listProfilesByNick(singletonList, bizType, (IObserver) new IObserver<List<? extends SimpleProfile>>() { // from class: com.taobao.message.sp.framework.service.SimpleProfileCache$fetch$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    } else {
                        IObserver.this.onComplete();
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onNext(List<? extends SimpleProfile> p0) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6d15fbea", new Object[]{this, p0});
                        return;
                    }
                    q.c(p0, "p0");
                    SimpleProfile simpleProfile2 = p0.get(0);
                    SimpleProfileCache.INSTANCE.add(simpleProfile2);
                    IObserver.this.onNext(simpleProfile2);
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable p0) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, p0});
                        return;
                    }
                    q.c(p0, "p0");
                    IObserver.this.onError(p0);
                }
            });
        } else {
            ISimpleDataService obtain2 = SimpleServiceFactory.obtain(identifier, channelType, ISimpleProfileService.class);
            if (obtain2 == null) {
                q.a();
            }
            List<String> singletonList2 = Collections.singletonList(targetId);
            q.a((Object) singletonList2, "Collections.singletonList(targetId)");
            ((ISimpleProfileService) obtain2).listProfiles(singletonList2, bizType, (IObserver) new IObserver<List<? extends SimpleProfile>>() { // from class: com.taobao.message.sp.framework.service.SimpleProfileCache$fetch$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    } else {
                        IObserver.this.onComplete();
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onNext(List<? extends SimpleProfile> p0) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6d15fbea", new Object[]{this, p0});
                        return;
                    }
                    q.c(p0, "p0");
                    SimpleProfile simpleProfile2 = p0.get(0);
                    SimpleProfileCache.INSTANCE.add(simpleProfile2);
                    IObserver.this.onNext(simpleProfile2);
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable p0) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, p0});
                        return;
                    }
                    q.c(p0, "p0");
                    IObserver.this.onError(p0);
                }
            });
        }
    }

    public final void add(SimpleProfile it) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94488f70", new Object[]{this, it});
            return;
        }
        q.c(it, "it");
        SimpleTarget target = it.getTarget();
        q.a((Object) target, "it.target");
        String targetId = target.getTargetId();
        if (targetId != null) {
            cache.put(targetId, it);
        }
        String nick = it.getNick();
        if (nick == null) {
            return;
        }
        cacheByNick.put(nick, it);
    }

    public final void add(List<? extends SimpleProfile> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d80199", new Object[]{this, list});
            return;
        }
        q.c(list, "list");
        for (SimpleProfile simpleProfile : list) {
            INSTANCE.add(simpleProfile);
        }
    }
}
