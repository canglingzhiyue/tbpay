package com.ali.adapt.api;

import android.os.AsyncTask;
import android.support.v4.util.Pair;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.c;
import com.taobao.cart.api.ITBCartService;
import com.taobao.ma.api.ITBInsideService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.giv;
import tb.giw;
import tb.nyf;
import tb.pbe;

/* loaded from: classes.dex */
public class AtlasServiceFinder implements AliServiceFinder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile AtlasServiceFinder c;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<Class, Object> f1799a = new ConcurrentHashMap<>();
    private final Map<Class, Pair<String, String>> b = new ConcurrentHashMap();

    public AtlasServiceFinder() {
        c = this;
        try {
            registerService(giw.class, "com.taobao.android.capsule", "com.taobao.android.favoritesdk.newbase.TBFavoriteServiceImpl");
            registerService(giv.class, "com.taobao.android.capsule", "com.taobao.android.favoritesdk.newbase.TBFavoriteServiceImpl");
            registerService(ITBCartService.class, "com.taobao.android.newtrade", "com.taobao.android.trade.cart.provider.TBCartServiceImpl");
            registerService(ITBInsideService.class, "com.taobao.android.capsule", "com.taobao.android.inside.plugin.AlipayInsideServiceImpl");
            registerService(pbe.class, "com.taobao.taobao.home", "com.taobao.taobaoavsdk.services.LivePlayServiceImp");
            registerService(nyf.class, "com.taobao.android.capsule", "com.taobao.global.setting.TBSettingServiceImpl");
        } catch (Exception e) {
            Log.e("AtlasServiceFinder", e.getMessage(), e);
        }
    }

    public static AtlasServiceFinder getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtlasServiceFinder) ipChange.ipc$dispatch("2c41d482", new Object[0]);
        }
        if (c == null) {
            synchronized (AtlasServiceFinder.class) {
                if (c == null) {
                    c = new AtlasServiceFinder();
                }
            }
        }
        return c;
    }

    @Override // com.ali.adapt.api.AliServiceFinder
    public <T> T findServiceImpl(Class<T> cls) {
        Pair<String, String> pair = this.b.get(cls);
        if (pair == null) {
            r0 = "Service found: could not resolve " + cls;
            return null;
        }
        String str = pair.first;
        String str2 = pair.second;
        try {
            return (T) a(str).loadClass(str2).newInstance();
        } catch (ClassNotFoundException e) {
            Log.e("AtlasServiceFinder", "Unable to instantiate service " + str + " -> " + str2 + ": make sure class name exists, is public, and has an empty constructor that is public", e);
            return null;
        } catch (IllegalAccessException e2) {
            throw new AliAdaptServiceNotFoundException("Unable to instantiate service " + str + " -> " + str2 + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            Log.e("AtlasServiceFinder", "Unable to instantiate service " + str2 + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
            return null;
        } catch (Exception e4) {
            Log.e("AtlasServiceFinder", e4.getMessage(), e4);
            return null;
        }
    }

    @Override // com.ali.adapt.api.AliServiceFinder
    public <T> void findServiceImpl(final Class<T> cls, final AliServiceFindedCallback<T> aliServiceFindedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd5ecf4", new Object[]{this, cls, aliServiceFindedCallback});
        } else if (aliServiceFindedCallback == null) {
            throw new IllegalArgumentException("Illegal null callback argument");
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.ali.adapt.api.AtlasServiceFinder.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        aliServiceFindedCallback.onServiceFinded(AtlasServiceFinder.this.findServiceImpl(cls));
                    }
                }
            });
        }
    }

    private ClassLoader a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoader) ipChange.ipc$dispatch("8d26980c", new Object[]{this, str});
        }
        c.a(str, null);
        return getClass().getClassLoader();
    }

    public <I, C extends I> void registerService(Class<I> cls, Class<C> cls2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac48e979", new Object[]{this, cls, cls2});
        } else {
            registerService(cls, null, cls2.getName());
        }
    }

    public <I> void registerService(Class<I> cls, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaa8a158", new Object[]{this, cls, str, str2});
        } else if (cls == null) {
            throw new IllegalArgumentException("Illegal null serviceInterface argument");
        } else {
            if (str2 == null) {
                throw new IllegalArgumentException("Illegal null serviceImplementationClass argument");
            }
            this.b.put(cls, Pair.create(str, str2));
        }
    }
}
