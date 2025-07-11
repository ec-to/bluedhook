package com.zjfgh.bluedhook.simple;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class UserTicktocks {

    private int code;
    private String message;
    private List<DataUserTicktocks> data;
    private ExtraUserTicktocks extra;
    private String request_id;
    private double request_time;
    private double response_time;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataUserTicktocks> getData() {
        return data;
    }

    public void setData(List<DataUserTicktocks> data) {
        this.data = data;
    }

    public ExtraUserTicktocks getExtra() {
        return extra;
    }

    public void setExtra(ExtraUserTicktocks extra) {
        this.extra = extra;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public double getRequest_time() {
        return request_time;
    }

    public void setRequest_time(double request_time) {
        this.request_time = request_time;
    }

    public double getResponse_time() {
        return response_time;
    }

    public void setResponse_time(double response_time) {
        this.response_time = response_time;
    }

    public static class ExtraUserTicktocks {
        private int hasmore;
        private List<?> feed_guide;

        public int getHasmore() {
            return hasmore;
        }

        public void setHasmore(int hasmore) {
            this.hasmore = hasmore;
        }

        public List<?> getFeed_guide() {
            return feed_guide;
        }

        public void setFeed_guide(List<?> feed_guide) {
            this.feed_guide = feed_guide;
        }
    }

    public static class DataUserTicktocks {
        private String feed_id;
        private int feed_uid;
        private int feed_status;
        private int disallow_share;
        private String feed_timestamp;
        private String feed_content;
        private String feed_is_voice;
        private String feed_views;
        private List<String> feed_pics;
        private String feed_pics_num;
        private int feed_comment;
        private String feed_dig;
        private int allow_comments;
        private int is_repost;
        private String repost_ttid;
        private int repost_count;
        private int is_ads;
        private int is_url;
        private String location;
        @JSONField(name = "3rd_type")
        private String _$3rd_type;
        private String source;
        private int is_feed_anonym;
        private String feed_anonym_name;
        private String reading_scope;
        private String complete_style;
        private int tt_click_sum;
        private int is_top_hot;
        private FeedExtrasUserTicktocks feed_extras;
        private int feed_video_size;
        private int is_videos;
        private List<CommentsUserTicktocks> comments;
        private List<?> liked;
        private int iliked;
        private int is_markdown;
        private int multiboy;
        private String kol_name;
        private String note;
        private String user_name;
        private int reg_date;
        private String user_avatar;
        private int vbadge;
        private String blued_pic;
        private int anchor;
        private int is_new;
        private int live;
        private int online_state;
        private int theme_id;
        private int theme_pendant;
        private int height;
        private int weight;
        private int age;
        private int yy_vbadge;
        private String union_uid;
        private String role;
        private int last_operate;
        private int vip_grade;
        private int is_vip_annual;
        private int is_hide_last_operate;
        private int is_hide_distance;
        private int is_hide_city_settled;
        private int is_invisible_all;
        private int is_invisible_half;
        private int is_invisible_half_delay;
        private int is_show_vip_page;
        private int is_hide_vip_look;
        private int is_traceless_access;
        private int vip_exp_lvl;
        private double distance;
        private String recommend_time;
        private int relationship;
        private int location_lat;
        private int app;
        private int is_vote;
        private int is_questionnaire;
        private int tt_type;
        private String promotion_url;
        private String promotion_url_option;
        private int can_promotion;
        private int promotion_status;
        private int in_promotion;
        private int is_evaluate_activity;
        private String bubble_state_icon;
        private String bubble_state_name;
        private int bubble_classify_id;
        private int bubble_is_light;
        private String bubble_state;
        private String bubble_state_tt_id;
        private String bubble_state_count;
        private int is_bubble_ticktock;
        private int is_bubble_tt_click;
        private int is_say_hello;
        private int is_new_face;
        private List<Integer> feed_pics_width;
        private List<Integer> feed_pics_height;
        private List<Integer> feed_videos_width;
        private List<Integer> feed_videos_height;
        private List<String> feed_videos;
        private String super_did;
        private int is_super_topics;
        private String super_topics_name;
        private int super_topics_status;
        private List<?> topic_list;
        private int is_share_super_topics;
        private int share_s_t_did;
        private String share_s_t_name;
        private int share_s_t_avatar;
        private int share_s_t_des;
        private int is_join_circle;
        private int join_circle_id;
        private String join_circle_title;
        private String join_circle_pic;
        private String join_circle_description;
        private int members_num;
        private RepostUserTicktocks repost;
        private int is_share_posting;
        private int feed_show;
        private List<?> face_point;
        private int is_expression;
        private int expression_id;
        private int interaction_id;
        private int interaction_count;
        private List<?> bubble_tt_click_uid;
        private int bubble_tt_click_count;
        private Imagemogr2LongPicUserTicktocks imagemogr2_long_pic;
        private int release_guide_feed;
        private String recommendation;

        public String getFeed_id() {
            return feed_id;
        }

        public void setFeed_id(String feed_id) {
            this.feed_id = feed_id;
        }

        public int getFeed_uid() {
            return feed_uid;
        }

        public void setFeed_uid(int feed_uid) {
            this.feed_uid = feed_uid;
        }

        public int getFeed_status() {
            return feed_status;
        }

        public void setFeed_status(int feed_status) {
            this.feed_status = feed_status;
        }

        public int getDisallow_share() {
            return disallow_share;
        }

        public void setDisallow_share(int disallow_share) {
            this.disallow_share = disallow_share;
        }

        public String getFeed_timestamp() {
            return feed_timestamp;
        }

        public void setFeed_timestamp(String feed_timestamp) {
            this.feed_timestamp = feed_timestamp;
        }

        public String getFeed_content() {
            return feed_content;
        }

        public void setFeed_content(String feed_content) {
            this.feed_content = feed_content;
        }

        public String getFeed_is_voice() {
            return feed_is_voice;
        }

        public void setFeed_is_voice(String feed_is_voice) {
            this.feed_is_voice = feed_is_voice;
        }

        public String getFeed_views() {
            return feed_views;
        }

        public void setFeed_views(String feed_views) {
            this.feed_views = feed_views;
        }

        public List<String> getFeed_pics() {
            return feed_pics;
        }

        public void setFeed_pics(List<String> feed_pics) {
            this.feed_pics = feed_pics;
        }

        public String getFeed_pics_num() {
            return feed_pics_num;
        }

        public void setFeed_pics_num(String feed_pics_num) {
            this.feed_pics_num = feed_pics_num;
        }

        public int getFeed_comment() {
            return feed_comment;
        }

        public void setFeed_comment(int feed_comment) {
            this.feed_comment = feed_comment;
        }

        public String getFeed_dig() {
            return feed_dig;
        }

        public void setFeed_dig(String feed_dig) {
            this.feed_dig = feed_dig;
        }

        public int getAllow_comments() {
            return allow_comments;
        }

        public void setAllow_comments(int allow_comments) {
            this.allow_comments = allow_comments;
        }

        public int getIs_repost() {
            return is_repost;
        }

        public void setIs_repost(int is_repost) {
            this.is_repost = is_repost;
        }

        public String getRepost_ttid() {
            return repost_ttid;
        }

        public void setRepost_ttid(String repost_ttid) {
            this.repost_ttid = repost_ttid;
        }

        public int getRepost_count() {
            return repost_count;
        }

        public void setRepost_count(int repost_count) {
            this.repost_count = repost_count;
        }

        public int getIs_ads() {
            return is_ads;
        }

        public void setIs_ads(int is_ads) {
            this.is_ads = is_ads;
        }

        public int getIs_url() {
            return is_url;
        }

        public void setIs_url(int is_url) {
            this.is_url = is_url;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String get_$3rd_type() {
            return _$3rd_type;
        }

        public void set_$3rd_type(String _$3rd_type) {
            this._$3rd_type = _$3rd_type;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public int getIs_feed_anonym() {
            return is_feed_anonym;
        }

        public void setIs_feed_anonym(int is_feed_anonym) {
            this.is_feed_anonym = is_feed_anonym;
        }

        public String getFeed_anonym_name() {
            return feed_anonym_name;
        }

        public void setFeed_anonym_name(String feed_anonym_name) {
            this.feed_anonym_name = feed_anonym_name;
        }

        public String getReading_scope() {
            return reading_scope;
        }

        public void setReading_scope(String reading_scope) {
            this.reading_scope = reading_scope;
        }

        public String getComplete_style() {
            return complete_style;
        }

        public void setComplete_style(String complete_style) {
            this.complete_style = complete_style;
        }

        public int getTt_click_sum() {
            return tt_click_sum;
        }

        public void setTt_click_sum(int tt_click_sum) {
            this.tt_click_sum = tt_click_sum;
        }

        public int getIs_top_hot() {
            return is_top_hot;
        }

        public void setIs_top_hot(int is_top_hot) {
            this.is_top_hot = is_top_hot;
        }

        public FeedExtrasUserTicktocks getFeed_extras() {
            return feed_extras;
        }

        public void setFeed_extras(FeedExtrasUserTicktocks feed_extras) {
            this.feed_extras = feed_extras;
        }

        public int getFeed_video_size() {
            return feed_video_size;
        }

        public void setFeed_video_size(int feed_video_size) {
            this.feed_video_size = feed_video_size;
        }

        public int getIs_videos() {
            return is_videos;
        }

        public void setIs_videos(int is_videos) {
            this.is_videos = is_videos;
        }

        public List<CommentsUserTicktocks> getComments() {
            return comments;
        }

        public void setComments(List<CommentsUserTicktocks> comments) {
            this.comments = comments;
        }

        public List<?> getLiked() {
            return liked;
        }

        public void setLiked(List<?> liked) {
            this.liked = liked;
        }

        public int getIliked() {
            return iliked;
        }

        public void setIliked(int iliked) {
            this.iliked = iliked;
        }

        public int getIs_markdown() {
            return is_markdown;
        }

        public void setIs_markdown(int is_markdown) {
            this.is_markdown = is_markdown;
        }

        public int getMultiboy() {
            return multiboy;
        }

        public void setMultiboy(int multiboy) {
            this.multiboy = multiboy;
        }

        public String getKol_name() {
            return kol_name;
        }

        public void setKol_name(String kol_name) {
            this.kol_name = kol_name;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public int getReg_date() {
            return reg_date;
        }

        public void setReg_date(int reg_date) {
            this.reg_date = reg_date;
        }

        public String getUser_avatar() {
            return user_avatar;
        }

        public void setUser_avatar(String user_avatar) {
            this.user_avatar = user_avatar;
        }

        public int getVbadge() {
            return vbadge;
        }

        public void setVbadge(int vbadge) {
            this.vbadge = vbadge;
        }

        public String getBlued_pic() {
            return blued_pic;
        }

        public void setBlued_pic(String blued_pic) {
            this.blued_pic = blued_pic;
        }

        public int getAnchor() {
            return anchor;
        }

        public void setAnchor(int anchor) {
            this.anchor = anchor;
        }

        public int getIs_new() {
            return is_new;
        }

        public void setIs_new(int is_new) {
            this.is_new = is_new;
        }

        public int getLive() {
            return live;
        }

        public void setLive(int live) {
            this.live = live;
        }

        public int getOnline_state() {
            return online_state;
        }

        public void setOnline_state(int online_state) {
            this.online_state = online_state;
        }

        public int getTheme_id() {
            return theme_id;
        }

        public void setTheme_id(int theme_id) {
            this.theme_id = theme_id;
        }

        public int getTheme_pendant() {
            return theme_pendant;
        }

        public void setTheme_pendant(int theme_pendant) {
            this.theme_pendant = theme_pendant;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getYy_vbadge() {
            return yy_vbadge;
        }

        public void setYy_vbadge(int yy_vbadge) {
            this.yy_vbadge = yy_vbadge;
        }

        public String getUnion_uid() {
            return union_uid;
        }

        public void setUnion_uid(String union_uid) {
            this.union_uid = union_uid;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public int getLast_operate() {
            return last_operate;
        }

        public void setLast_operate(int last_operate) {
            this.last_operate = last_operate;
        }

        public int getVip_grade() {
            return vip_grade;
        }

        public void setVip_grade(int vip_grade) {
            this.vip_grade = vip_grade;
        }

        public int getIs_vip_annual() {
            return is_vip_annual;
        }

        public void setIs_vip_annual(int is_vip_annual) {
            this.is_vip_annual = is_vip_annual;
        }

        public int getIs_hide_last_operate() {
            return is_hide_last_operate;
        }

        public void setIs_hide_last_operate(int is_hide_last_operate) {
            this.is_hide_last_operate = is_hide_last_operate;
        }

        public int getIs_hide_distance() {
            return is_hide_distance;
        }

        public void setIs_hide_distance(int is_hide_distance) {
            this.is_hide_distance = is_hide_distance;
        }

        public int getIs_hide_city_settled() {
            return is_hide_city_settled;
        }

        public void setIs_hide_city_settled(int is_hide_city_settled) {
            this.is_hide_city_settled = is_hide_city_settled;
        }

        public int getIs_invisible_all() {
            return is_invisible_all;
        }

        public void setIs_invisible_all(int is_invisible_all) {
            this.is_invisible_all = is_invisible_all;
        }

        public int getIs_invisible_half() {
            return is_invisible_half;
        }

        public void setIs_invisible_half(int is_invisible_half) {
            this.is_invisible_half = is_invisible_half;
        }

        public int getIs_invisible_half_delay() {
            return is_invisible_half_delay;
        }

        public void setIs_invisible_half_delay(int is_invisible_half_delay) {
            this.is_invisible_half_delay = is_invisible_half_delay;
        }

        public int getIs_show_vip_page() {
            return is_show_vip_page;
        }

        public void setIs_show_vip_page(int is_show_vip_page) {
            this.is_show_vip_page = is_show_vip_page;
        }

        public int getIs_hide_vip_look() {
            return is_hide_vip_look;
        }

        public void setIs_hide_vip_look(int is_hide_vip_look) {
            this.is_hide_vip_look = is_hide_vip_look;
        }

        public int getIs_traceless_access() {
            return is_traceless_access;
        }

        public void setIs_traceless_access(int is_traceless_access) {
            this.is_traceless_access = is_traceless_access;
        }

        public int getVip_exp_lvl() {
            return vip_exp_lvl;
        }

        public void setVip_exp_lvl(int vip_exp_lvl) {
            this.vip_exp_lvl = vip_exp_lvl;
        }

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }

        public String getRecommend_time() {
            return recommend_time;
        }

        public void setRecommend_time(String recommend_time) {
            this.recommend_time = recommend_time;
        }

        public int getRelationship() {
            return relationship;
        }

        public void setRelationship(int relationship) {
            this.relationship = relationship;
        }

        public int getLocation_lat() {
            return location_lat;
        }

        public void setLocation_lat(int location_lat) {
            this.location_lat = location_lat;
        }

        public int getApp() {
            return app;
        }

        public void setApp(int app) {
            this.app = app;
        }

        public int getIs_vote() {
            return is_vote;
        }

        public void setIs_vote(int is_vote) {
            this.is_vote = is_vote;
        }

        public int getIs_questionnaire() {
            return is_questionnaire;
        }

        public void setIs_questionnaire(int is_questionnaire) {
            this.is_questionnaire = is_questionnaire;
        }

        public int getTt_type() {
            return tt_type;
        }

        public void setTt_type(int tt_type) {
            this.tt_type = tt_type;
        }

        public String getPromotion_url() {
            return promotion_url;
        }

        public void setPromotion_url(String promotion_url) {
            this.promotion_url = promotion_url;
        }

        public String getPromotion_url_option() {
            return promotion_url_option;
        }

        public void setPromotion_url_option(String promotion_url_option) {
            this.promotion_url_option = promotion_url_option;
        }

        public int getCan_promotion() {
            return can_promotion;
        }

        public void setCan_promotion(int can_promotion) {
            this.can_promotion = can_promotion;
        }

        public int getPromotion_status() {
            return promotion_status;
        }

        public void setPromotion_status(int promotion_status) {
            this.promotion_status = promotion_status;
        }

        public int getIn_promotion() {
            return in_promotion;
        }

        public void setIn_promotion(int in_promotion) {
            this.in_promotion = in_promotion;
        }

        public int getIs_evaluate_activity() {
            return is_evaluate_activity;
        }

        public void setIs_evaluate_activity(int is_evaluate_activity) {
            this.is_evaluate_activity = is_evaluate_activity;
        }

        public String getBubble_state_icon() {
            return bubble_state_icon;
        }

        public void setBubble_state_icon(String bubble_state_icon) {
            this.bubble_state_icon = bubble_state_icon;
        }

        public String getBubble_state_name() {
            return bubble_state_name;
        }

        public void setBubble_state_name(String bubble_state_name) {
            this.bubble_state_name = bubble_state_name;
        }

        public int getBubble_classify_id() {
            return bubble_classify_id;
        }

        public void setBubble_classify_id(int bubble_classify_id) {
            this.bubble_classify_id = bubble_classify_id;
        }

        public int getBubble_is_light() {
            return bubble_is_light;
        }

        public void setBubble_is_light(int bubble_is_light) {
            this.bubble_is_light = bubble_is_light;
        }

        public String getBubble_state() {
            return bubble_state;
        }

        public void setBubble_state(String bubble_state) {
            this.bubble_state = bubble_state;
        }

        public String getBubble_state_tt_id() {
            return bubble_state_tt_id;
        }

        public void setBubble_state_tt_id(String bubble_state_tt_id) {
            this.bubble_state_tt_id = bubble_state_tt_id;
        }

        public String getBubble_state_count() {
            return bubble_state_count;
        }

        public void setBubble_state_count(String bubble_state_count) {
            this.bubble_state_count = bubble_state_count;
        }

        public int getIs_bubble_ticktock() {
            return is_bubble_ticktock;
        }

        public void setIs_bubble_ticktock(int is_bubble_ticktock) {
            this.is_bubble_ticktock = is_bubble_ticktock;
        }

        public int getIs_bubble_tt_click() {
            return is_bubble_tt_click;
        }

        public void setIs_bubble_tt_click(int is_bubble_tt_click) {
            this.is_bubble_tt_click = is_bubble_tt_click;
        }

        public int getIs_say_hello() {
            return is_say_hello;
        }

        public void setIs_say_hello(int is_say_hello) {
            this.is_say_hello = is_say_hello;
        }

        public int getIs_new_face() {
            return is_new_face;
        }

        public void setIs_new_face(int is_new_face) {
            this.is_new_face = is_new_face;
        }

        public List<Integer> getFeed_pics_width() {
            return feed_pics_width;
        }

        public void setFeed_pics_width(List<Integer> feed_pics_width) {
            this.feed_pics_width = feed_pics_width;
        }

        public List<Integer> getFeed_pics_height() {
            return feed_pics_height;
        }

        public void setFeed_pics_height(List<Integer> feed_pics_height) {
            this.feed_pics_height = feed_pics_height;
        }

        public List<?> getFeed_videos_width() {
            return feed_videos_width;
        }

        public void setFeed_videos_width(List<Integer> feed_videos_width) {
            this.feed_videos_width = feed_videos_width;
        }

        public List<?> getFeed_videos_height() {
            return feed_videos_height;
        }

        public void setFeed_videos_height(List<Integer> feed_videos_height) {
            this.feed_videos_height = feed_videos_height;
        }

        public List<String> getFeed_videos() {
            return feed_videos;
        }

        public void setFeed_videos(List<String> feed_videos) {
            this.feed_videos = feed_videos;
        }

        public String getSuper_did() {
            return super_did;
        }

        public void setSuper_did(String super_did) {
            this.super_did = super_did;
        }

        public int getIs_super_topics() {
            return is_super_topics;
        }

        public void setIs_super_topics(int is_super_topics) {
            this.is_super_topics = is_super_topics;
        }

        public String getSuper_topics_name() {
            return super_topics_name;
        }

        public void setSuper_topics_name(String super_topics_name) {
            this.super_topics_name = super_topics_name;
        }

        public int getSuper_topics_status() {
            return super_topics_status;
        }

        public void setSuper_topics_status(int super_topics_status) {
            this.super_topics_status = super_topics_status;
        }

        public List<?> getTopic_list() {
            return topic_list;
        }

        public void setTopic_list(List<?> topic_list) {
            this.topic_list = topic_list;
        }

        public int getIs_share_super_topics() {
            return is_share_super_topics;
        }

        public void setIs_share_super_topics(int is_share_super_topics) {
            this.is_share_super_topics = is_share_super_topics;
        }

        public int getShare_s_t_did() {
            return share_s_t_did;
        }

        public void setShare_s_t_did(int share_s_t_did) {
            this.share_s_t_did = share_s_t_did;
        }

        public String getShare_s_t_name() {
            return share_s_t_name;
        }

        public void setShare_s_t_name(String share_s_t_name) {
            this.share_s_t_name = share_s_t_name;
        }

        public int getShare_s_t_avatar() {
            return share_s_t_avatar;
        }

        public void setShare_s_t_avatar(int share_s_t_avatar) {
            this.share_s_t_avatar = share_s_t_avatar;
        }

        public int getShare_s_t_des() {
            return share_s_t_des;
        }

        public void setShare_s_t_des(int share_s_t_des) {
            this.share_s_t_des = share_s_t_des;
        }

        public int getIs_join_circle() {
            return is_join_circle;
        }

        public void setIs_join_circle(int is_join_circle) {
            this.is_join_circle = is_join_circle;
        }

        public int getJoin_circle_id() {
            return join_circle_id;
        }

        public void setJoin_circle_id(int join_circle_id) {
            this.join_circle_id = join_circle_id;
        }

        public String getJoin_circle_title() {
            return join_circle_title;
        }

        public void setJoin_circle_title(String join_circle_title) {
            this.join_circle_title = join_circle_title;
        }

        public String getJoin_circle_pic() {
            return join_circle_pic;
        }

        public void setJoin_circle_pic(String join_circle_pic) {
            this.join_circle_pic = join_circle_pic;
        }

        public String getJoin_circle_description() {
            return join_circle_description;
        }

        public void setJoin_circle_description(String join_circle_description) {
            this.join_circle_description = join_circle_description;
        }

        public int getMembers_num() {
            return members_num;
        }

        public void setMembers_num(int members_num) {
            this.members_num = members_num;
        }

        public RepostUserTicktocks getRepost() {
            return repost;
        }

        public void setRepost(RepostUserTicktocks repost) {
            this.repost = repost;
        }

        public int getIs_share_posting() {
            return is_share_posting;
        }

        public void setIs_share_posting(int is_share_posting) {
            this.is_share_posting = is_share_posting;
        }

        public int getFeed_show() {
            return feed_show;
        }

        public void setFeed_show(int feed_show) {
            this.feed_show = feed_show;
        }

        public List<?> getFace_point() {
            return face_point;
        }

        public void setFace_point(List<?> face_point) {
            this.face_point = face_point;
        }

        public int getIs_expression() {
            return is_expression;
        }

        public void setIs_expression(int is_expression) {
            this.is_expression = is_expression;
        }

        public int getExpression_id() {
            return expression_id;
        }

        public void setExpression_id(int expression_id) {
            this.expression_id = expression_id;
        }

        public int getInteraction_id() {
            return interaction_id;
        }

        public void setInteraction_id(int interaction_id) {
            this.interaction_id = interaction_id;
        }

        public int getInteraction_count() {
            return interaction_count;
        }

        public void setInteraction_count(int interaction_count) {
            this.interaction_count = interaction_count;
        }

        public List<?> getBubble_tt_click_uid() {
            return bubble_tt_click_uid;
        }

        public void setBubble_tt_click_uid(List<?> bubble_tt_click_uid) {
            this.bubble_tt_click_uid = bubble_tt_click_uid;
        }

        public int getBubble_tt_click_count() {
            return bubble_tt_click_count;
        }

        public void setBubble_tt_click_count(int bubble_tt_click_count) {
            this.bubble_tt_click_count = bubble_tt_click_count;
        }

        public Imagemogr2LongPicUserTicktocks getImagemogr2_long_pic() {
            return imagemogr2_long_pic;
        }

        public void setImagemogr2_long_pic(Imagemogr2LongPicUserTicktocks imagemogr2_long_pic) {
            this.imagemogr2_long_pic = imagemogr2_long_pic;
        }

        public int getRelease_guide_feed() {
            return release_guide_feed;
        }

        public void setRelease_guide_feed(int release_guide_feed) {
            this.release_guide_feed = release_guide_feed;
        }

        public String getRecommendation() {
            return recommendation;
        }

        public void setRecommendation(String recommendation) {
            this.recommendation = recommendation;
        }

        public static class FeedExtrasUserTicktocks {
        }

        public static class RepostUserTicktocks {
            private int feed_is_delete;
            private int is_share_posting;

            public int getFeed_is_delete() {
                return feed_is_delete;
            }

            public void setFeed_is_delete(int feed_is_delete) {
                this.feed_is_delete = feed_is_delete;
            }

            public int getIs_share_posting() {
                return is_share_posting;
            }

            public void setIs_share_posting(int is_share_posting) {
                this.is_share_posting = is_share_posting;
            }
        }

        public static class Imagemogr2LongPicUserTicktocks {
            private String single;
            private List<String> multiple;

            public String getSingle() {
                return single;
            }

            public void setSingle(String single) {
                this.single = single;
            }

            public List<String> getMultiple() {
                return multiple;
            }

            public void setMultiple(List<String> multiple) {
                this.multiple = multiple;
            }
        }

        public static class CommentsUserTicktocks {
            private int comment_uid;
            private String feed_id;
            private String comment_content;
            private String comment_status;
            private int comment_timestamp;
            private String is_comment_anonym;
            private String comment_anonym_name;
            private int comment_id;
            private String reply_real_id;
            private String reply_comment_id;
            private String user_name;
            private int anchor;
            private int is_new;
            private int live;
            private String note;
            private String user_avatar;
            private int vip_grade;
            private int is_vip_annual;
            private int is_hide_last_operate;
            private int is_hide_distance;
            private int is_hide_city_settled;
            private int is_invisible_all;
            private int is_invisible_half;
            private int is_invisible_half_delay;
            private int is_show_vip_page;
            private int is_hide_vip_look;
            private int is_traceless_access;
            private int vip_exp_lvl;
            private int is_reply;
            private int comment_allow_delete;
            private List<?> comment_pics;
            private int comment_pics_num;
            private List<?> comment_pics_width;
            private List<?> comment_pics_height;

            public int getComment_uid() {
                return comment_uid;
            }

            public void setComment_uid(int comment_uid) {
                this.comment_uid = comment_uid;
            }

            public String getFeed_id() {
                return feed_id;
            }

            public void setFeed_id(String feed_id) {
                this.feed_id = feed_id;
            }

            public String getComment_content() {
                return comment_content;
            }

            public void setComment_content(String comment_content) {
                this.comment_content = comment_content;
            }

            public String getComment_status() {
                return comment_status;
            }

            public void setComment_status(String comment_status) {
                this.comment_status = comment_status;
            }

            public int getComment_timestamp() {
                return comment_timestamp;
            }

            public void setComment_timestamp(int comment_timestamp) {
                this.comment_timestamp = comment_timestamp;
            }

            public String getIs_comment_anonym() {
                return is_comment_anonym;
            }

            public void setIs_comment_anonym(String is_comment_anonym) {
                this.is_comment_anonym = is_comment_anonym;
            }

            public String getComment_anonym_name() {
                return comment_anonym_name;
            }

            public void setComment_anonym_name(String comment_anonym_name) {
                this.comment_anonym_name = comment_anonym_name;
            }

            public int getComment_id() {
                return comment_id;
            }

            public void setComment_id(int comment_id) {
                this.comment_id = comment_id;
            }

            public String getReply_real_id() {
                return reply_real_id;
            }

            public void setReply_real_id(String reply_real_id) {
                this.reply_real_id = reply_real_id;
            }

            public String getReply_comment_id() {
                return reply_comment_id;
            }

            public void setReply_comment_id(String reply_comment_id) {
                this.reply_comment_id = reply_comment_id;
            }

            public String getUser_name() {
                return user_name;
            }

            public void setUser_name(String user_name) {
                this.user_name = user_name;
            }

            public int getAnchor() {
                return anchor;
            }

            public void setAnchor(int anchor) {
                this.anchor = anchor;
            }

            public int getIs_new() {
                return is_new;
            }

            public void setIs_new(int is_new) {
                this.is_new = is_new;
            }

            public int getLive() {
                return live;
            }

            public void setLive(int live) {
                this.live = live;
            }

            public String getNote() {
                return note;
            }

            public void setNote(String note) {
                this.note = note;
            }

            public String getUser_avatar() {
                return user_avatar;
            }

            public void setUser_avatar(String user_avatar) {
                this.user_avatar = user_avatar;
            }

            public int getVip_grade() {
                return vip_grade;
            }

            public void setVip_grade(int vip_grade) {
                this.vip_grade = vip_grade;
            }

            public int getIs_vip_annual() {
                return is_vip_annual;
            }

            public void setIs_vip_annual(int is_vip_annual) {
                this.is_vip_annual = is_vip_annual;
            }

            public int getIs_hide_last_operate() {
                return is_hide_last_operate;
            }

            public void setIs_hide_last_operate(int is_hide_last_operate) {
                this.is_hide_last_operate = is_hide_last_operate;
            }

            public int getIs_hide_distance() {
                return is_hide_distance;
            }

            public void setIs_hide_distance(int is_hide_distance) {
                this.is_hide_distance = is_hide_distance;
            }

            public int getIs_hide_city_settled() {
                return is_hide_city_settled;
            }

            public void setIs_hide_city_settled(int is_hide_city_settled) {
                this.is_hide_city_settled = is_hide_city_settled;
            }

            public int getIs_invisible_all() {
                return is_invisible_all;
            }

            public void setIs_invisible_all(int is_invisible_all) {
                this.is_invisible_all = is_invisible_all;
            }

            public int getIs_invisible_half() {
                return is_invisible_half;
            }

            public void setIs_invisible_half(int is_invisible_half) {
                this.is_invisible_half = is_invisible_half;
            }

            public int getIs_invisible_half_delay() {
                return is_invisible_half_delay;
            }

            public void setIs_invisible_half_delay(int is_invisible_half_delay) {
                this.is_invisible_half_delay = is_invisible_half_delay;
            }

            public int getIs_show_vip_page() {
                return is_show_vip_page;
            }

            public void setIs_show_vip_page(int is_show_vip_page) {
                this.is_show_vip_page = is_show_vip_page;
            }

            public int getIs_hide_vip_look() {
                return is_hide_vip_look;
            }

            public void setIs_hide_vip_look(int is_hide_vip_look) {
                this.is_hide_vip_look = is_hide_vip_look;
            }

            public int getIs_traceless_access() {
                return is_traceless_access;
            }

            public void setIs_traceless_access(int is_traceless_access) {
                this.is_traceless_access = is_traceless_access;
            }

            public int getVip_exp_lvl() {
                return vip_exp_lvl;
            }

            public void setVip_exp_lvl(int vip_exp_lvl) {
                this.vip_exp_lvl = vip_exp_lvl;
            }

            public int getIs_reply() {
                return is_reply;
            }

            public void setIs_reply(int is_reply) {
                this.is_reply = is_reply;
            }

            public int getComment_allow_delete() {
                return comment_allow_delete;
            }

            public void setComment_allow_delete(int comment_allow_delete) {
                this.comment_allow_delete = comment_allow_delete;
            }

            public List<?> getComment_pics() {
                return comment_pics;
            }

            public void setComment_pics(List<?> comment_pics) {
                this.comment_pics = comment_pics;
            }

            public int getComment_pics_num() {
                return comment_pics_num;
            }

            public void setComment_pics_num(int comment_pics_num) {
                this.comment_pics_num = comment_pics_num;
            }

            public List<?> getComment_pics_width() {
                return comment_pics_width;
            }

            public void setComment_pics_width(List<?> comment_pics_width) {
                this.comment_pics_width = comment_pics_width;
            }

            public List<?> getComment_pics_height() {
                return comment_pics_height;
            }

            public void setComment_pics_height(List<?> comment_pics_height) {
                this.comment_pics_height = comment_pics_height;
            }
        }
    }
}
