package com.alipay.birdnest.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.util.LruCache;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import com.alipay.android.app.template.FBResourceClient;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.api.ImageLoader;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.friend.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import tb.cun;

/* loaded from: classes3.dex */
public class FBImageLoader implements ImageLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FBImageLoader";

    /* renamed from: a  reason: collision with root package name */
    public static int f5263a = -1;
    public boolean d;
    public SparseArray<Set<String>> c = new SparseArray<>();
    public final LruCache<String, LocalCacheItem> b = new LruCache<String, LocalCacheItem>(1048576) { // from class: com.alipay.birdnest.util.FBImageLoader.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v4.util.LruCache
        public void entryRemoved(boolean z, String str, LocalCacheItem localCacheItem, LocalCacheItem localCacheItem2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbb419b3", new Object[]{this, new Boolean(z), str, localCacheItem, localCacheItem2});
                return;
            }
            String str2 = str;
            LocalCacheItem localCacheItem3 = localCacheItem;
            if (localCacheItem3 == null) {
                return;
            }
            localCacheItem3.b = null;
            Set<String> set = FBImageLoader.this.c.get(localCacheItem3.f5267a, null);
            if (set == null) {
                return;
            }
            set.remove(str2);
        }

        @Override // android.support.v4.util.LruCache
        public int sizeOf(String str, LocalCacheItem localCacheItem) {
            Drawable drawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("33c6036a", new Object[]{this, str, localCacheItem})).intValue();
            }
            LocalCacheItem localCacheItem2 = localCacheItem;
            if (localCacheItem2 != null && (drawable = localCacheItem2.b) != null) {
                return (drawable.getIntrinsicWidth() * localCacheItem2.b.getIntrinsicHeight()) << 2;
            }
            return 0;
        }
    };

    /* loaded from: classes3.dex */
    public static class LocalCacheItem {

        /* renamed from: a  reason: collision with root package name */
        public int f5267a;
        public Drawable b;
    }

    public FBImageLoader(BirdNestEngine birdNestEngine) {
        try {
            if (BirdNestEngine.useSkipOldSwitches) {
                this.d = false;
            } else {
                this.d = birdNestEngine.getConfig().getSettingProvider().getSwitch("BIRDNEST_TEST_IMG_OBJ_WHEN_FAIL", false);
            }
        } catch (Throwable th) {
            FBLogger.e(TAG, th);
        }
    }

    public final Drawable a(View view, String str, int[] iArr, boolean z, String str2, boolean z2, FBResourceClient fBResourceClient, Context context, BirdNestEngine.ResourceProvider resourceProvider, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("7c58a96d", new Object[]{this, view, str, iArr, new Boolean(z), str2, new Boolean(z2), fBResourceClient, context, resourceProvider, new Boolean(z3)});
        }
        Drawable drawable = null;
        if (fBResourceClient != null && str2 != null && str2.startsWith("/")) {
            try {
                Drawable drawable2 = (Drawable) fBResourceClient.shouldInterceptResource(str2, FBResourceClient.Type.DRAWABLE);
                if (z3 && drawable2 != null) {
                    try {
                        if (z) {
                            view.setBackgroundDrawable(drawable2);
                        } else {
                            ((ImageView) view).setImageDrawable(drawable2);
                        }
                        if (drawable2 instanceof AnimationDrawable) {
                            ((AnimationDrawable) drawable2).start();
                        }
                    } catch (Throwable th) {
                        th = th;
                        drawable = drawable2;
                        FBLogger.e(TAG, th);
                        return drawable;
                    }
                }
                return drawable2;
            } catch (Throwable th2) {
                th = th2;
            }
        } else if (TextUtils.isEmpty(str2)) {
            return null;
        } else {
            return loadLocalDrawable(resourceProvider, context, str2, str, iArr, z, view, z2, z3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alipay.birdnest.api.ImageLoader
    public void clearCache(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0fc0747", new Object[]{this, new Integer(i)});
            return;
        }
        Set<String> set = this.c.get(i);
        if (set == null || set.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.b.remove(arrayList.get(i2));
        }
        arrayList.clear();
        set.clear();
        this.c.remove(i);
        if (this.c.size() != 0) {
            return;
        }
        try {
            this.b.evictAll();
        } catch (IllegalStateException e) {
            FBLogger.e(TAG, e);
        }
    }

    @Override // com.alipay.birdnest.api.ImageLoader
    public void loadImage(BirdNestEngine birdNestEngine, final View view, final String str, String str2, int[] iArr, final boolean z, String str3, String str4, int i, boolean z2, final ImageLoader.ILayoutListener iLayoutListener, FBResourceClient fBResourceClient, final BirdNestEngine.ResourceProvider.Callback callback, Bundle bundle) {
        int i2;
        int i3;
        Object shouldInterceptResource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c90f1345", new Object[]{this, birdNestEngine, view, str, str2, iArr, new Boolean(z), str3, str4, new Integer(i), new Boolean(z2), iLayoutListener, fBResourceClient, callback, bundle});
        } else if (view == null) {
        } else {
            if (f5263a == -1) {
                int uniqueResId = birdNestEngine.getConfig().getIdProvider().getUniqueResId("alipay_msp_image_loader_view_tag");
                f5263a = uniqueResId;
                if (uniqueResId <= 0 || (uniqueResId >>> 24) < 2) {
                    FBLogger.e(TAG, "id provider err 2. " + f5263a + " from " + birdNestEngine.getConfig().getIdProvider());
                }
            }
            if (iArr != null) {
                i2 = iArr[0];
                i3 = iArr[1];
            } else {
                i2 = 100;
                i3 = 100;
            }
            Context context = view.getContext();
            BirdNestEngine.ResourceProvider resourceProvider = birdNestEngine.getConfig().getResourceProvider();
            if (fBResourceClient != null && !TextUtils.isEmpty(str) && (shouldInterceptResource = fBResourceClient.shouldInterceptResource(str, FBResourceClient.Type.DRAWABLE)) != null) {
                Drawable drawable = (Drawable) shouldInterceptResource;
                if (iLayoutListener != null) {
                    iLayoutListener.requestLayout(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                }
                if (!(view instanceof ImageView)) {
                    view.setBackgroundDrawable(drawable);
                } else if (z) {
                    view.setBackgroundDrawable(drawable);
                } else {
                    ((ImageView) view).setImageDrawable(drawable);
                }
            } else if (!TextUtils.isEmpty(str) && !str.startsWith("http") && !str.startsWith("https") && !str.startsWith("www") && !str.startsWith("data:") && str.contains("/")) {
                if (loadLocalDrawable(resourceProvider, context, str, str2, iArr, z, view, z2, true) != null) {
                    return;
                }
                if (z) {
                    view.setBackgroundDrawable(null);
                } else {
                    ((ImageView) view).setImageDrawable(null);
                }
            } else {
                int i4 = f5263a;
                if (i4 > 0) {
                    view.setTag(i4, str);
                }
                Drawable a2 = a(view, str2, iArr, z, str3, z2, fBResourceClient, context, resourceProvider, false);
                Drawable a3 = a(view, str2, iArr, z, str4, z2, fBResourceClient, context, resourceProvider, false);
                final boolean z3 = this.d;
                birdNestEngine.getConfig().getResourceProvider().getResourceAsync(view, str, i2, i3, a2, a3, i, z2, new BirdNestEngine.ResourceProvider.Callback(this) { // from class: com.alipay.birdnest.util.FBImageLoader.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.birdnest.api.BirdNestEngine.ResourceProvider.Callback
                    public void onLoadFailure(int i5, int i6, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4bc2b2a8", new Object[]{this, new Integer(i5), new Integer(i6), obj});
                            return;
                        }
                        FBLogger.d(FBImageLoader.TAG, "load Remote Image failed, url is " + str);
                        boolean z4 = obj instanceof Drawable;
                        if (z4) {
                            Drawable drawable2 = (Drawable) obj;
                            ImageLoader.ILayoutListener iLayoutListener2 = iLayoutListener;
                            if (iLayoutListener2 != null) {
                                iLayoutListener2.requestLayout(i5, i6);
                            }
                            View view2 = view;
                            if (view2 instanceof ImageView) {
                                if (z) {
                                    view2.setBackgroundDrawable(drawable2);
                                } else {
                                    ((ImageView) view2).setImageDrawable(drawable2);
                                }
                            } else {
                                view2.setBackgroundDrawable(drawable2);
                            }
                        }
                        BirdNestEngine.ResourceProvider.Callback callback2 = callback;
                        if (callback2 == null) {
                            return;
                        }
                        try {
                            if (!z3) {
                                callback2.onLoadFailure(i5, i6, obj);
                            } else if (!z4) {
                            } else {
                                callback2.onLoadFailure(i5, i6, obj);
                            }
                        } catch (Throwable th) {
                            FBLogger.e(FBImageLoader.TAG, th);
                        }
                    }

                    @Override // com.alipay.birdnest.api.BirdNestEngine.ResourceProvider.Callback
                    public void onLoadSuccess(final int i5, final int i6, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a1462621", new Object[]{this, new Integer(i5), new Integer(i6), obj});
                        } else if (!(obj instanceof Drawable)) {
                        } else {
                            Drawable drawable2 = (Drawable) obj;
                            if (iLayoutListener != null) {
                                view.post(new Runnable() { // from class: com.alipay.birdnest.util.FBImageLoader.2.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            iLayoutListener.requestLayout(i5, i6);
                                        }
                                    }
                                });
                            }
                            View view2 = view;
                            if (view2 instanceof ImageView) {
                                if (z) {
                                    view2.setBackgroundDrawable(drawable2);
                                } else {
                                    ((ImageView) view2).setImageDrawable(drawable2);
                                }
                            } else {
                                view2.setBackgroundDrawable(drawable2);
                            }
                            BirdNestEngine.ResourceProvider.Callback callback2 = callback;
                            if (callback2 == null) {
                                return;
                            }
                            try {
                                callback2.onLoadSuccess(i5, i6, obj);
                            } catch (Throwable th) {
                                FBLogger.e(FBImageLoader.TAG, th);
                            }
                        }
                    }
                }, bundle);
            }
        }
    }

    @Override // com.alipay.birdnest.api.ImageLoader
    public Drawable loadLocalDrawable(BirdNestEngine.ResourceProvider resourceProvider, Context context, String str, String str2, int[] iArr, boolean z, View view, boolean z2, boolean z3) {
        Drawable drawable;
        Bitmap decodeFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("7a17b675", new Object[]{this, resourceProvider, context, str, str2, iArr, new Boolean(z), view, new Boolean(z2), new Boolean(z3)});
        }
        if (TextUtils.isEmpty(str)) {
            if (z3) {
                if (z) {
                    view.setBackgroundDrawable(null);
                } else {
                    ((ImageView) view).setImageDrawable(null);
                }
            }
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        if (iArr != null && iArr.length == 2) {
            sb.append('_');
            sb.append(iArr[0]);
            sb.append('x');
            sb.append(iArr[1]);
        }
        if (z2) {
            sb.append("_needGray");
        }
        String sb2 = sb.toString();
        LocalCacheItem localCacheItem = this.b.get(sb2);
        if (localCacheItem == null) {
            if (str.startsWith("file://")) {
                String substring = str.substring(7);
                for (int i = 0; i < 3; i++) {
                    try {
                        decodeFile = BitmapFactory.decodeFile(substring);
                    } catch (Throwable th) {
                        try {
                            cun.a("UIResUtils", "failed to generate drawable from file", th);
                        } catch (Throwable th2) {
                            cun.a("UIResUtils", "failed to generate drawable from file", th2);
                        }
                    }
                    if (decodeFile != null) {
                        drawable = new BitmapDrawable(context.getResources(), decodeFile);
                        break;
                    }
                    continue;
                }
                drawable = null;
            } else {
                Object resource = resourceProvider.getResource(context, str, str2, a.CONTACTS_INFO_NOT_EMPTY_STATUS);
                if (resource instanceof Drawable) {
                    drawable = (Drawable) resource;
                }
                drawable = null;
            }
            if (z2 && (drawable instanceof BitmapDrawable)) {
                drawable = new BitmapDrawable(UiUtil.toGrayscale(((BitmapDrawable) drawable).getBitmap()));
            }
            if (drawable == null) {
                if (!z3) {
                    return null;
                }
                if (z) {
                    view.setBackgroundDrawable(null);
                    return null;
                }
                ((ImageView) view).setImageDrawable(null);
                return null;
            }
            int hashCode = view.getContext().hashCode();
            LocalCacheItem localCacheItem2 = new LocalCacheItem();
            localCacheItem2.f5267a = hashCode;
            localCacheItem2.b = drawable;
            Set<String> set = this.c.get(hashCode, null);
            if (set == null) {
                set = new HashSet<>();
                this.c.put(hashCode, set);
            }
            set.add(sb2);
            this.b.put(sb2, localCacheItem2);
        } else {
            drawable = localCacheItem.b;
        }
        if (z3) {
            if (z) {
                view.setBackgroundDrawable(drawable);
            } else {
                ((ImageView) view).setImageDrawable(drawable);
            }
            if (drawable instanceof AnimationDrawable) {
                ((AnimationDrawable) drawable).start();
            }
        }
        return drawable;
    }
}
