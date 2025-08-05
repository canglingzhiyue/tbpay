package com.taobao.desktop.widget.template.standard;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class WidgetStandardData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String deepLink;
    private ExtData ext;
    private String imageUrl;
    private long nextRefreshTime;
    private String overlayImageUrl;
    private String overlayMaterialUrl;

    static {
        kge.a(1769838445);
        kge.a(1028243835);
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
        return ipChange instanceof IpChange ? (ExtData) ipChange.ipc$dispatch("e24aa4bf", new Object[]{this}) : this.ext;
    }

    public void setExt(ExtData extData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5db0181", new Object[]{this, extData});
        } else {
            this.ext = extData;
        }
    }

    /* loaded from: classes7.dex */
    public static class ExtData implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<ContainersData> containers;
        private int templateType;

        static {
            kge.a(-870664428);
            kge.a(1028243835);
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

        public List<ContainersData> getContainers() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ba5005d8", new Object[]{this}) : this.containers;
        }

        public void setContainers(List<ContainersData> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50879b8c", new Object[]{this, list});
            } else {
                this.containers = list;
            }
        }

        /* loaded from: classes7.dex */
        public static class ContainersData implements Serializable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private String collect;
            private String collectBgUrl;
            private String collectColor;
            private String contentBgUrl;
            private String contentImageUrl;
            private String deepLink;
            private String description;
            private String descriptionColor;
            private String squareContentImageUrl;
            private String tag;
            private String tagBgColor;
            private String tagBgGradient;
            private String tagBgUrl;
            private String tagColor;
            private String title;
            private String titleBgUrl;
            private String titleColor;

            static {
                kge.a(-1127495028);
                kge.a(1028243835);
            }

            public String getContentBgUrl() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e8d6d4f2", new Object[]{this}) : this.contentBgUrl;
            }

            public void setContentBgUrl(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c2a23dc4", new Object[]{this, str});
                } else {
                    this.contentBgUrl = str;
                }
            }

            public String getContentImageUrl() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c918be2", new Object[]{this}) : this.contentImageUrl;
            }

            public void setContentImageUrl(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("afc7c53c", new Object[]{this, str});
                } else {
                    this.contentImageUrl = str;
                }
            }

            public String getSquareContentImageUrl() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f9b49e1f", new Object[]{this}) : this.squareContentImageUrl;
            }

            public void setSquareContentImageUrl(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("933a539f", new Object[]{this, str});
                } else {
                    this.squareContentImageUrl = str;
                }
            }

            public String getTitleBgUrl() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dc1b6491", new Object[]{this}) : this.titleBgUrl;
            }

            public void setTitleBgUrl(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1e3ab505", new Object[]{this, str});
                } else {
                    this.titleBgUrl = str;
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

            public String getTagBgUrl() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e4dfdd3", new Object[]{this}) : this.tagBgUrl;
            }

            public void setTagBgUrl(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("464f1703", new Object[]{this, str});
                } else {
                    this.tagBgUrl = str;
                }
            }

            public String getTagColor() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e5b22fa", new Object[]{this}) : this.tagColor;
            }

            public void setTagColor(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("37e696bc", new Object[]{this, str});
                } else {
                    this.tagColor = str;
                }
            }

            public String getTag() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this}) : this.tag;
            }

            public void setTag(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
                } else {
                    this.tag = str;
                }
            }

            public String getTagBgGradient() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e6393680", new Object[]{this}) : this.tagBgGradient;
            }

            public void setTagBgGradient(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("158d7b5e", new Object[]{this, str});
                } else {
                    this.tagBgGradient = str;
                }
            }

            public String getTagBgColor() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("be0b7e1f", new Object[]{this}) : this.tagBgColor;
            }

            public void setTagBgColor(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7a4dcd37", new Object[]{this, str});
                } else {
                    this.tagBgColor = str;
                }
            }

            public String getDescriptionColor() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f0a66dc", new Object[]{this}) : this.descriptionColor;
            }

            public void setDescriptionColor(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7e85031a", new Object[]{this, str});
                } else {
                    this.descriptionColor = str;
                }
            }

            public String getDescription() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b9cffbf3", new Object[]{this}) : this.description;
            }

            public void setDescription(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("97e6b14b", new Object[]{this, str});
                } else {
                    this.description = str;
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
        }
    }
}
