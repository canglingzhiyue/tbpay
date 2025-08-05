package com.taobao.uikit.extend.feature.features;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.nia;

/* loaded from: classes9.dex */
public class PhenixOptions {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FUZZY_MATCH_CACHE = 32;
    public static final int ONLY_CACHE = 8;
    public static final int PRELOAD_WITH_SMALL = 1;
    public static final int SCALE_FROM_LARGE = 2;
    public static final int SKIP_CACHE = 4;
    public static final int USE_ORIGIN_IF_THUMB_NOT_EXIST = 16;
    public nia[] bitmapProcessors;
    private Map<String, String> mLoaderExtras;
    public int mSwitchFlags;
    public Map<String, String> openTraceContext;
    public String priorityModuleName;
    public int thumbnailType;
    private boolean strictMatchCache = false;
    public int schedulePriority = 2;
    public int memoryCachePriority = 17;
    public int diskCachePriority = 17;

    public boolean isOpened(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c9162d0d", new Object[]{this, new Integer(i)})).booleanValue() : (i & this.mSwitchFlags) > 0;
    }

    public PhenixOptions priorityModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixOptions) ipChange.ipc$dispatch("85d9f26f", new Object[]{this, str});
        }
        this.priorityModuleName = str;
        return this;
    }

    public PhenixOptions asThumbnail(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixOptions) ipChange.ipc$dispatch("c945b89", new Object[]{this, new Integer(i), new Boolean(z)});
        }
        this.thumbnailType = i;
        if (z) {
            this.mSwitchFlags |= 16;
        } else {
            this.mSwitchFlags &= -17;
        }
        return this;
    }

    public PhenixOptions bitmapProcessors(nia... niaVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixOptions) ipChange.ipc$dispatch("c613d233", new Object[]{this, niaVarArr});
        }
        this.bitmapProcessors = niaVarArr;
        return this;
    }

    public PhenixOptions schedulePriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixOptions) ipChange.ipc$dispatch("f8ed401a", new Object[]{this, new Integer(i)});
        }
        this.schedulePriority = i;
        return this;
    }

    public PhenixOptions memoryCachePriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixOptions) ipChange.ipc$dispatch("28161384", new Object[]{this, new Integer(i)});
        }
        this.memoryCachePriority = i;
        return this;
    }

    public PhenixOptions diskCachePriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixOptions) ipChange.ipc$dispatch("6bdb9268", new Object[]{this, new Integer(i)});
        }
        this.diskCachePriority = i;
        return this;
    }

    public PhenixOptions preloadWithSmall(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixOptions) ipChange.ipc$dispatch("7cc02a26", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            this.mSwitchFlags |= 1;
        } else {
            this.mSwitchFlags &= -2;
        }
        return this;
    }

    public PhenixOptions scaleFromLarge(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixOptions) ipChange.ipc$dispatch("40644d55", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            this.mSwitchFlags |= 2;
        } else {
            this.mSwitchFlags &= -3;
        }
        return this;
    }

    public PhenixOptions skipCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixOptions) ipChange.ipc$dispatch("903a4511", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            this.mSwitchFlags |= 4;
        } else {
            this.mSwitchFlags &= -5;
        }
        return this;
    }

    public PhenixOptions onlyCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixOptions) ipChange.ipc$dispatch("ef2e3884", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            this.mSwitchFlags |= 8;
        } else {
            this.mSwitchFlags &= -9;
        }
        return this;
    }

    public PhenixOptions fuzzyMatchCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixOptions) ipChange.ipc$dispatch("bbc8dc35", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            this.mSwitchFlags |= 32;
        } else {
            this.mSwitchFlags &= -33;
        }
        return this;
    }

    public PhenixOptions addLoaderExtra(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixOptions) ipChange.ipc$dispatch("676ab7c4", new Object[]{this, str, str2});
        }
        if (this.mLoaderExtras == null) {
            this.mLoaderExtras = new ConcurrentHashMap();
        }
        this.mLoaderExtras.put(str, str2);
        return this;
    }

    public PhenixOptions setOpenTraceContext(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixOptions) ipChange.ipc$dispatch("ec207753", new Object[]{this, map});
        }
        this.openTraceContext = map;
        return this;
    }

    public PhenixOptions setStrictMatchCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhenixOptions) ipChange.ipc$dispatch("c3990f36", new Object[]{this, new Boolean(z)});
        }
        this.strictMatchCache = z;
        return this;
    }

    public boolean isStrictMatchCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a636363b", new Object[]{this})).booleanValue() : this.strictMatchCache;
    }

    public Map<String, String> getLoaderExtras() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d190648", new Object[]{this});
        }
        Map<String, String> map = this.mLoaderExtras;
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    public Map<String, String> getOpenTraceContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e79d2786", new Object[]{this}) : this.openTraceContext;
    }

    public static boolean isSame(PhenixOptions phenixOptions, PhenixOptions phenixOptions2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bd1bdc5", new Object[]{phenixOptions, phenixOptions2})).booleanValue();
        }
        if (phenixOptions == phenixOptions2) {
            return true;
        }
        if (phenixOptions == null || phenixOptions2 == null) {
            return false;
        }
        if (phenixOptions.priorityModuleName == null && phenixOptions2.priorityModuleName != null) {
            return false;
        }
        String str = phenixOptions.priorityModuleName;
        if ((str != null && !str.equals(phenixOptions2.priorityModuleName)) || phenixOptions.thumbnailType != phenixOptions2.thumbnailType || phenixOptions.schedulePriority != phenixOptions2.schedulePriority || phenixOptions.diskCachePriority != phenixOptions2.diskCachePriority || phenixOptions.mSwitchFlags != phenixOptions2.mSwitchFlags) {
            return false;
        }
        if (phenixOptions.bitmapProcessors == null && phenixOptions2.bitmapProcessors != null) {
            return false;
        }
        nia[] niaVarArr = phenixOptions.bitmapProcessors;
        if (niaVarArr != null) {
            nia[] niaVarArr2 = phenixOptions2.bitmapProcessors;
            if (niaVarArr2 == null || niaVarArr.length != niaVarArr2.length) {
                return false;
            }
            int i = 0;
            while (true) {
                nia[] niaVarArr3 = phenixOptions.bitmapProcessors;
                if (i >= niaVarArr3.length) {
                    break;
                }
                nia niaVar = niaVarArr3[i];
                nia niaVar2 = phenixOptions2.bitmapProcessors[i];
                if (niaVar.getClass() != niaVar2.getClass()) {
                    return false;
                }
                String id = niaVar.getId();
                String id2 = niaVar2.getId();
                if (id == null && id2 != null) {
                    return false;
                }
                if (id != null && !id.equals(id2)) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}
