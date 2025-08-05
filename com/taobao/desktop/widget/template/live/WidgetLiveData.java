package com.taobao.desktop.widget.template.live;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class WidgetLiveData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String deepLink;
    private ExtData ext;
    private String imageUrl;
    private long nextRefreshTime;

    static {
        kge.a(-1451380979);
        kge.a(1028243835);
    }

    /* loaded from: classes7.dex */
    public static class ExtData implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private LotteryStatus lotteryStatus;
        private StatusData status;
        private String subTitle;
        private String template;
        private String title;

        static {
            kge.a(-589746508);
            kge.a(1028243835);
        }

        public String getTitle() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
        }

        public void setTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
            } else {
                this.title = str;
            }
        }

        public String getSubTitle() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d9c4664b", new Object[]{this}) : this.subTitle;
        }

        public void setSubTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9a5bd8b", new Object[]{this, str});
            } else {
                this.subTitle = str;
            }
        }

        public StatusData getStatus() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (StatusData) ipChange.ipc$dispatch("23f814", new Object[]{this}) : this.status;
        }

        public void setStatus(StatusData statusData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50d945da", new Object[]{this, statusData});
            } else {
                this.status = statusData;
            }
        }

        public String getTemplate() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca44bb09", new Object[]{this}) : this.template;
        }

        public void setTemplate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("930008d", new Object[]{this, str});
            } else {
                this.template = str;
            }
        }

        public LotteryStatus getLotteryStatus() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LotteryStatus) ipChange.ipc$dispatch("dcbdfb6e", new Object[]{this}) : this.lotteryStatus;
        }

        public void setLotteryStatus(LotteryStatus lotteryStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67243b64", new Object[]{this, lotteryStatus});
            } else {
                this.lotteryStatus = lotteryStatus;
            }
        }

        /* loaded from: classes7.dex */
        public static class StatusData implements Serializable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private String bgColor;
            private String bgGradient;
            private String icon;
            private String title;

            static {
                kge.a(-1679670580);
                kge.a(1028243835);
            }

            public String getTitle() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
            }

            public void setTitle(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
                } else {
                    this.title = str;
                }
            }

            public String getBgColor() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("73519e11", new Object[]{this}) : this.bgColor;
            }

            public void setBgColor(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fde5aced", new Object[]{this, str});
                } else {
                    this.bgColor = str;
                }
            }

            public String getBgGradient() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1b8b94e", new Object[]{this}) : this.bgGradient;
            }

            public void setBgGradient(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bc47f7e8", new Object[]{this, str});
                } else {
                    this.bgGradient = str;
                }
            }

            public String getIcon() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e32456a", new Object[]{this}) : this.icon;
            }

            public void setIcon(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2c95a84c", new Object[]{this, str});
                } else {
                    this.icon = str;
                }
            }
        }

        /* loaded from: classes7.dex */
        public static class LotteryStatus implements Serializable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private String chevron;
            private String icon;
            private String itemPic;
            private String recStatus;
            private String title;
            private String titleColor;

            static {
                kge.a(-272161141);
                kge.a(1028243835);
            }

            public String getItemPic() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f977f458", new Object[]{this}) : this.itemPic;
            }

            public void setItemPic(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c8a1f86", new Object[]{this, str});
                } else {
                    this.itemPic = str;
                }
            }

            public String getTitle() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
            }

            public void setTitle(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
                } else {
                    this.title = str;
                }
            }

            public String getTitleColor() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec2889b8", new Object[]{this}) : this.titleColor;
            }

            public void setTitleColor(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fd234be", new Object[]{this, str});
                } else {
                    this.titleColor = str;
                }
            }

            public String getIcon() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2e32456a", new Object[]{this}) : this.icon;
            }

            public void setIcon(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2c95a84c", new Object[]{this, str});
                } else {
                    this.icon = str;
                }
            }

            public String getRecStatus() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3bc7a08d", new Object[]{this}) : this.recStatus;
            }

            public void setRecStatus(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bf6a2cf1", new Object[]{this, str});
                } else {
                    this.recStatus = str;
                }
            }

            public String getChevron() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("47954a14", new Object[]{this}) : this.chevron;
            }

            public void setChevron(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b217814a", new Object[]{this, str});
                } else {
                    this.chevron = str;
                }
            }
        }
    }

    public long getNextRefreshTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e3c0fa1a", new Object[]{this})).longValue() : this.nextRefreshTime;
    }

    public void setNextRefreshTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb1f06a", new Object[]{this, new Long(j)});
        } else {
            this.nextRefreshTime = j;
        }
    }

    public String getImageUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this}) : this.imageUrl;
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else {
            this.imageUrl = str;
        }
    }

    public String getDeepLink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2eb98bfd", new Object[]{this}) : this.deepLink;
    }

    public void setDeepLink(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33554e19", new Object[]{this, str});
        } else {
            this.deepLink = str;
        }
    }

    public ExtData getExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExtData) ipChange.ipc$dispatch("8c91b91f", new Object[]{this}) : this.ext;
    }

    public void setExt(ExtData extData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51382e1", new Object[]{this, extData});
        } else {
            this.ext = extData;
        }
    }
}
