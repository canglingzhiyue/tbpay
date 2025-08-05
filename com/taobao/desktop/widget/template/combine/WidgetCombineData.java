package com.taobao.desktop.widget.template.combine;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class WidgetCombineData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String deepLink;
    private ExtData ext;
    private String imageUrl;
    private long nextRefreshTime;
    private String overlayImageUrl;
    private String overlayMaterialUrl;
    private int taobaoIconType;

    static {
        kge.a(-182467067);
        kge.a(1028243835);
    }

    /* loaded from: classes7.dex */
    public static class ExtData implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<EntranceData> entrance;
        private int templateType;

        static {
            kge.a(-363803220);
            kge.a(1028243835);
        }

        public List<EntranceData> getEntrance() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d7eadf34", new Object[]{this}) : this.entrance;
        }

        public void setEntrance(List<EntranceData> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb1480b0", new Object[]{this, list});
            } else {
                this.entrance = list;
            }
        }

        public int getTemplateType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8b9c64c4", new Object[]{this})).intValue() : this.templateType;
        }

        public void setTemplateType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c386b4c6", new Object[]{this, new Integer(i)});
            } else {
                this.templateType = i;
            }
        }

        /* loaded from: classes7.dex */
        public static class EntranceData implements Serializable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private String BgGradient;
            private String bgColor;
            private String bgUrl;
            private String collect;
            private String collectBgUrl;
            private String collectColor;
            private String deepLink;
            private String imageUrl;
            private String subTitle;
            private String subTitleColor;
            private String title;
            private String titleColor;

            static {
                kge.a(-933581928);
                kge.a(1028243835);
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

            public String getCollect() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c95f285", new Object[]{this}) : this.collect;
            }

            public void setCollect(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fd2be6f9", new Object[]{this, str});
                } else {
                    this.collect = str;
                }
            }

            public String getBgGradient() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1b8b94e", new Object[]{this}) : this.BgGradient;
            }

            public void setBgGradient(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("bc47f7e8", new Object[]{this, str});
                } else {
                    this.BgGradient = str;
                }
            }

            public String getBgUrl() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("721f7245", new Object[]{this}) : this.bgUrl;
            }

            public void setBgUrl(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7ea76c39", new Object[]{this, str});
                } else {
                    this.bgUrl = str;
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

            public String getSubTitleColor() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cf72b384", new Object[]{this}) : this.subTitleColor;
            }

            public void setSubTitleColor(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("53839eda", new Object[]{this, str});
                } else {
                    this.subTitleColor = str;
                }
            }

            public String getCollectBgUrl() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("60a49663", new Object[]{this}) : this.collectBgUrl;
            }

            public void setCollectBgUrl(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("448caa73", new Object[]{this, str});
                } else {
                    this.collectBgUrl = str;
                }
            }

            public String getCollectColor() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("70b1bb8a", new Object[]{this}) : this.collectColor;
            }

            public void setCollectColor(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("36242a2c", new Object[]{this, str});
                } else {
                    this.collectColor = str;
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
        return ipChange instanceof IpChange ? (ExtData) ipChange.ipc$dispatch("e5d2c727", new Object[]{this}) : this.ext;
    }

    public void setExt(ExtData extData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93077329", new Object[]{this, extData});
        } else {
            this.ext = extData;
        }
    }

    public String getOverlayImageUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a86ff6b", new Object[]{this}) : this.overlayImageUrl;
    }

    public void setOverlayImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a080c2d3", new Object[]{this, str});
        } else {
            this.overlayImageUrl = str;
        }
    }

    public String getOverlayMaterialUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4183556b", new Object[]{this}) : this.overlayMaterialUrl;
    }

    public void setOverlayMaterialUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b9136b", new Object[]{this, str});
        } else {
            this.overlayMaterialUrl = str;
        }
    }

    public int getTaobaoIconType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2cbc6091", new Object[]{this})).intValue() : this.taobaoIconType;
    }

    public void setTaobaoIconType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b914e599", new Object[]{this, new Integer(i)});
        } else {
            this.taobaoIconType = i;
        }
    }
}
