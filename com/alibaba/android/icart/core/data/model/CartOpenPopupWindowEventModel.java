package com.alibaba.android.icart.core.data.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class CartOpenPopupWindowEventModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Css css;
    public boolean isFilterPopLayer;
    public boolean needRefreshForNoFilter;
    public Options options;

    static {
        kge.a(-1021080513);
        kge.a(1028243835);
    }

    public Css getCss() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Css) ipChange.ipc$dispatch("26f21dc7", new Object[]{this}) : this.css;
    }

    public void setCss(Css css) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4641203b", new Object[]{this, css});
        } else {
            this.css = css;
        }
    }

    public Options getOptions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Options) ipChange.ipc$dispatch("4578d927", new Object[]{this}) : this.options;
    }

    public void setOptions(Options options) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0ab805", new Object[]{this, options});
        } else {
            this.options = options;
        }
    }

    public boolean isFilterPopLayer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5943006d", new Object[]{this})).booleanValue() : this.isFilterPopLayer;
    }

    public void setIsFilterPopLayer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aadc4449", new Object[]{this, new Boolean(z)});
        } else {
            this.isFilterPopLayer = z;
        }
    }

    public boolean isNeedRefreshForNoFilter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ba0c18b2", new Object[]{this})).booleanValue() : this.needRefreshForNoFilter;
    }

    public void setNeedRefreshForNoFilter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209a3dae", new Object[]{this, new Boolean(z)});
        } else {
            this.needRefreshForNoFilter = z;
        }
    }

    /* loaded from: classes2.dex */
    public static class Css implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String maxHeight;
        public String minHeight;
        public String radius;
        public String themeUrl;
        public String height = "0.6";
        public String windowColor = "#FFFFFF";

        static {
            kge.a(839302142);
            kge.a(1028243835);
        }

        public String getHeight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f6ba1efc", new Object[]{this}) : this.height;
        }

        public void setHeight(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8033adfa", new Object[]{this, str});
            } else {
                this.height = str;
            }
        }

        public String getMinHeight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbdaab76", new Object[]{this}) : this.minHeight;
        }

        public void setMinHeight(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41b87f28", new Object[]{this, str});
            } else {
                this.minHeight = str;
            }
        }

        public String getMaxHeight() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d985d124", new Object[]{this}) : this.maxHeight;
        }

        public void setMaxHeight(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9720f3a", new Object[]{this, str});
            } else {
                this.maxHeight = str;
            }
        }

        public String getWindowColor() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c4eab2fc", new Object[]{this}) : this.windowColor;
        }

        public void setWindowColor(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f022db62", new Object[]{this, str});
            } else {
                this.windowColor = str;
            }
        }

        public String getRadius() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cd902471", new Object[]{this}) : this.radius;
        }

        public void setRadius(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("841e5725", new Object[]{this, str});
            } else {
                this.radius = str;
            }
        }

        public String getThemeUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("78836c1d", new Object[]{this}) : this.themeUrl;
        }

        public void setThemeUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22c771f9", new Object[]{this, str});
            } else {
                this.themeUrl = str;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Options implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String needCloseButton = "true";

        static {
            kge.a(-1911010535);
            kge.a(1028243835);
        }

        public String getNeedCloseButton() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2abeaf1b", new Object[]{this}) : this.needCloseButton;
        }

        public void setNeedCloseButton(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e73f0923", new Object[]{this, str});
            } else {
                this.needCloseButton = str;
            }
        }
    }
}
