package com.alibaba.android.ultron.trade.event.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class OpenPopupWindowEventModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Css css;
    public Options options;

    static {
        kge.a(1099260385);
        kge.a(1028243835);
    }

    public Css getCss() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Css) ipChange.ipc$dispatch("f2846891", new Object[]{this}) : this.css;
    }

    public void setCss(Css css) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c1d7", new Object[]{this, css});
        } else {
            this.css = css;
        }
    }

    public Options getOptions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Options) ipChange.ipc$dispatch("cc02875b", new Object[]{this}) : this.options;
    }

    public void setOptions(Options options) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d3ec77", new Object[]{this, options});
        } else {
            this.options = options;
        }
    }

    /* loaded from: classes2.dex */
    public static class Css implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String height = "0.6";
        public String maxHeight;
        public String minHeight;

        static {
            kge.a(1516302496);
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
    }

    /* loaded from: classes2.dex */
    public static class Options implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String needCloseButton = "true";

        static {
            kge.a(-551330117);
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
