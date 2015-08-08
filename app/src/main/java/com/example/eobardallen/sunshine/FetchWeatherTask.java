


<!DOCTYPE html>
<html lang="en" class=" is-copy-enabled">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    <meta name="viewport" content="width=1020">
    
    
    <title>Sunshine-Version-2/FetchWeatherTask.java at lesson_4_content_provider_starter_code · udacity/Sunshine-Version-2 · GitHub</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png">
    <meta property="fb:app_id" content="1401488693436528">

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="udacity/Sunshine-Version-2" name="twitter:title" /><meta content="Sunshine-Version-2 - The official repository for Developing Android Apps" name="twitter:description" /><meta content="https://avatars3.githubusercontent.com/u/1916665?v=3&amp;s=400" name="twitter:image:src" />
      <meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars3.githubusercontent.com/u/1916665?v=3&amp;s=400" property="og:image" /><meta content="udacity/Sunshine-Version-2" property="og:title" /><meta content="https://github.com/udacity/Sunshine-Version-2" property="og:url" /><meta content="Sunshine-Version-2 - The official repository for Developing Android Apps" property="og:description" />
      <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">
    <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">
    <link rel="assets" href="https://assets-cdn.github.com/">
    
    <meta name="pjax-timeout" content="1000">
    

    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="selected-link" value="repo_source" data-pjax-transient>

        <meta name="google-analytics" content="UA-3769691-2">

    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="AE73855D:65B8:16AE09E2:55C67243" name="octolytics-dimension-request_id" />
    
    <meta content="Rails, view, blob#show" data-pjax-transient="true" name="analytics-event" />
    <meta class="js-ga-set" name="dimension1" content="Logged Out">
      <meta class="js-ga-set" name="dimension4" content="Current repo nav">
    <meta name="is-dotcom" content="true">
        <meta name="hostname" content="github.com">
    <meta name="user-login" content="">

      <link rel="icon" sizes="any" mask href="https://assets-cdn.github.com/pinned-octocat.svg">
      <meta name="theme-color" content="#4078c0">
      <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico">

    <!-- </textarea> --><!-- '"` --><meta content="authenticity_token" name="csrf-param" />
<meta content="vJXbDqhmniRkIGl0IK0+aWRfq8Mh7GaOqEjkDPXfYMZSpwAt+RpIE1yTnhPVBV4SbArbEVL6hmBouPVvs4e1Jw==" name="csrf-token" />
    

    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github/index-e85c4df2f00f610f7d403b70cb6ff08a89f810737918e84973d175e3c3e31f50.css" media="all" rel="stylesheet" />
    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github2/index-ef69b63d2441844ee240b72490c991b23eae664f050aa0236621ac6d79ede650.css" media="all" rel="stylesheet" />
    
    


    <meta http-equiv="x-pjax-version" content="70012b92e357cadd9a56e312f3a3769f">

      
  <meta name="description" content="Sunshine-Version-2 - The official repository for Developing Android Apps">
  <meta name="go-import" content="github.com/udacity/Sunshine-Version-2 git https://github.com/udacity/Sunshine-Version-2.git">

  <meta content="1916665" name="octolytics-dimension-user_id" /><meta content="udacity" name="octolytics-dimension-user_login" /><meta content="31690108" name="octolytics-dimension-repository_id" /><meta content="udacity/Sunshine-Version-2" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="31690108" name="octolytics-dimension-repository_network_root_id" /><meta content="udacity/Sunshine-Version-2" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/udacity/Sunshine-Version-2/commits/lesson_4_content_provider_starter_code.atom" rel="alternate" title="Recent Commits to Sunshine-Version-2:lesson_4_content_provider_starter_code" type="application/atom+xml">

  </head>


  <body class="logged_out  env-production windows vis-public page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>
    <div class="wrapper">
      
      
      



        
        <div class="header header-logged-out" role="banner">
  <div class="container clearfix">

    <a class="header-logo-wordmark" href="https://github.com/" data-ga-click="(Logged out) Header, go to homepage, icon:logo-wordmark">
      <span class="mega-octicon octicon-logo-github"></span>
    </a>

    <div class="header-actions" role="navigation">
        <a class="btn btn-primary" href="/join" data-ga-click="(Logged out) Header, clicked Sign up, text:sign-up">Sign up</a>
      <a class="btn" href="/login?return_to=%2Fudacity%2FSunshine-Version-2%2Fblob%2Flesson_4_content_provider_starter_code%2FFetchWeatherTask.java" data-ga-click="(Logged out) Header, clicked Sign in, text:sign-in">Sign in</a>
    </div>

    <div class="site-search repo-scope js-site-search" role="search">
      <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/udacity/Sunshine-Version-2/search" class="js-site-search-form" data-global-search-url="/search" data-repo-search-url="/udacity/Sunshine-Version-2/search" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
  <label class="js-chromeless-input-container form-control">
    <div class="scope-badge">This repository</div>
    <input type="text"
      class="js-site-search-focus js-site-search-field is-clearable chromeless-input"
      data-hotkey="s"
      name="q"
      placeholder="Search"
      aria-label="Search this repository"
      data-global-scope-placeholder="Search GitHub"
      data-repo-scope-placeholder="Search"
      tabindex="1"
      autocapitalize="off">
  </label>
</form>
    </div>

      <ul class="header-nav left" role="navigation">
          <li class="header-nav-item">
            <a class="header-nav-link" href="/explore" data-ga-click="(Logged out) Header, go to explore, text:explore">Explore</a>
          </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="/features" data-ga-click="(Logged out) Header, go to features, text:features">Features</a>
          </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="https://enterprise.github.com/" data-ga-click="(Logged out) Header, go to enterprise, text:enterprise">Enterprise</a>
          </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="/blog" data-ga-click="(Logged out) Header, go to blog, text:blog">Blog</a>
          </li>
      </ul>

  </div>
</div>



      <div id="start-of-content" class="accessibility-aid"></div>
          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    <div id="js-flash-container">
      
    </div>
    <div class="pagehead repohead instapaper_ignore readability-menu ">
      <div class="container">

        <div class="clearfix">
          
<ul class="pagehead-actions">

  <li>
      <a href="/login?return_to=%2Fudacity%2FSunshine-Version-2"
    class="btn btn-sm btn-with-count tooltipped tooltipped-n"
    aria-label="You must be signed in to watch a repository" rel="nofollow">
    <span class="octicon octicon-eye"></span>
    Watch
  </a>
  <a class="social-count" href="/udacity/Sunshine-Version-2/watchers">
    255
  </a>

  </li>

  <li>
      <a href="/login?return_to=%2Fudacity%2FSunshine-Version-2"
    class="btn btn-sm btn-with-count tooltipped tooltipped-n"
    aria-label="You must be signed in to star a repository" rel="nofollow">
    <span class="octicon octicon-star"></span>
    Star
  </a>

    <a class="social-count js-social-count" href="/udacity/Sunshine-Version-2/stargazers">
      706
    </a>

  </li>

    <li>
      <a href="/login?return_to=%2Fudacity%2FSunshine-Version-2"
        class="btn btn-sm btn-with-count tooltipped tooltipped-n"
        aria-label="You must be signed in to fork a repository" rel="nofollow">
        <span class="octicon octicon-repo-forked"></span>
        Fork
      </a>
      <a href="/udacity/Sunshine-Version-2/network" class="social-count">
        1,222
      </a>
    </li>
</ul>

          <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public ">
            <span class="mega-octicon octicon-repo"></span>
            <span class="author"><a href="/udacity" class="url fn" itemprop="url" rel="author"><span itemprop="title">udacity</span></a></span><!--
         --><span class="path-divider">/</span><!--
         --><strong><a href="/udacity/Sunshine-Version-2" data-pjax="#js-repo-pjax-container">Sunshine-Version-2</a></strong>

            <span class="page-context-loader">
              <img alt="" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
            </span>

          </h1>
        </div>

      </div>
    </div>

      <div class="container">
        <div class="repository-with-sidebar repo-container new-discussion-timeline ">
          <div class="repository-sidebar clearfix">
              

<nav class="sunken-menu repo-nav js-repo-nav js-sidenav-container-pjax js-octicon-loaders"
     role="navigation"
     data-pjax="#js-repo-pjax-container"
     data-issue-count-url="/udacity/Sunshine-Version-2/issues/counts">
  <ul class="sunken-menu-group">
    <li class="tooltipped tooltipped-w" aria-label="Code">
      <a href="/udacity/Sunshine-Version-2/tree/lesson_4_content_provider_starter_code" aria-label="Code" aria-selected="true" class="js-selected-navigation-item selected sunken-menu-item" data-hotkey="g c" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /udacity/Sunshine-Version-2/tree/lesson_4_content_provider_starter_code">
        <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>

      <li class="tooltipped tooltipped-w" aria-label="Issues">
        <a href="/udacity/Sunshine-Version-2/issues" aria-label="Issues" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g i" data-selected-links="repo_issues repo_labels repo_milestones /udacity/Sunshine-Version-2/issues">
          <span class="octicon octicon-issue-opened"></span> <span class="full-word">Issues</span>
          <span class="js-issue-replace-counter"></span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

    <li class="tooltipped tooltipped-w" aria-label="Pull requests">
      <a href="/udacity/Sunshine-Version-2/pulls" aria-label="Pull requests" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g p" data-selected-links="repo_pulls /udacity/Sunshine-Version-2/pulls">
          <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull requests</span>
          <span class="js-pull-replace-counter"></span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>

  </ul>
  <div class="sunken-menu-separator"></div>
  <ul class="sunken-menu-group">

    <li class="tooltipped tooltipped-w" aria-label="Pulse">
      <a href="/udacity/Sunshine-Version-2/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-selected-links="pulse /udacity/Sunshine-Version-2/pulse">
        <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>

    <li class="tooltipped tooltipped-w" aria-label="Graphs">
      <a href="/udacity/Sunshine-Version-2/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-selected-links="repo_graphs repo_contributors /udacity/Sunshine-Version-2/graphs">
        <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>
  </ul>


</nav>

                <div class="only-with-full-nav">
                    
<div class="js-clone-url clone-url open"
  data-protocol-type="http">
  <h3><span class="text-emphasized">HTTPS</span> clone URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="https://github.com/udacity/Sunshine-Version-2.git" readonly="readonly" aria-label="HTTPS clone URL">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  
<div class="js-clone-url clone-url "
  data-protocol-type="subversion">
  <h3><span class="text-emphasized">Subversion</span> checkout URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="https://github.com/udacity/Sunshine-Version-2" readonly="readonly" aria-label="Subversion checkout URL">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>



  <div class="clone-options">You can clone with
    <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone" class="inline-form js-clone-selector-form " data-form-nonce="d4914f36aaf9fd0e870364ca4914af95c521eba5" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="kH3A3PCB6s4DPedsHfUQzdc2QUE5QqzfzNBmTk2/ICRSREun7WZJxWdXqAd0pLoOTeLgoNC6GMZxCgliIkWxNQ==" /></div><button class="btn-link js-clone-selector" data-protocol="http" type="submit">HTTPS</button></form> or <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone" class="inline-form js-clone-selector-form " data-form-nonce="d4914f36aaf9fd0e870364ca4914af95c521eba5" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="3Ym0WRdO5yVL7RvAxsJT3YWFnd0RDivHduiyVtH+J0PYHpdmXpYt4Oqf23EpwIwMySIomegNdrOu/B4OKIC9Bg==" /></div><button class="btn-link js-clone-selector" data-protocol="subversion" type="submit">Subversion</button></form>.
    <a href="https://help.github.com/articles/which-remote-url-should-i-use" class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
      <span class="octicon octicon-question"></span>
    </a>
  </div>
    <a href="https://windows.github.com" class="btn btn-sm sidebar-button" title="Save udacity/Sunshine-Version-2 to your computer and use it in GitHub Desktop." aria-label="Save udacity/Sunshine-Version-2 to your computer and use it in GitHub Desktop.">
      <span class="octicon octicon-device-desktop"></span>
      Clone in Desktop
    </a>

                  <a href="/udacity/Sunshine-Version-2/archive/lesson_4_content_provider_starter_code.zip"
                     class="btn btn-sm sidebar-button"
                     aria-label="Download the contents of udacity/Sunshine-Version-2 as a zip file"
                     title="Download the contents of udacity/Sunshine-Version-2 as a zip file"
                     rel="nofollow">
                    <span class="octicon octicon-cloud-download"></span>
                    Download ZIP
                  </a>
                </div>
          </div>
          <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>

            

<a href="/udacity/Sunshine-Version-2/blob/1578a360189e9e929004894ed3e8f2210b7db8a7/FetchWeatherTask.java" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:b23f2c866271e2ddc5ced2c8f0eadbc4 -->

  <div class="file-navigation js-zeroclipboard-container">
    
<div class="select-menu js-menu-container js-select-menu left">
  <span class="btn btn-sm select-menu-button js-menu-target css-truncate" data-hotkey="w"
    data-ref="lesson_4_content_provider_starter_code"
    title="lesson_4_content_provider_starter_code"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <i>Branch:</i>
    <span class="js-select-button css-truncate-target">lesson_4_conte…</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
      </div>

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" data-filter-placeholder="Filter branches/tags" class="js-select-menu-tab" role="tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" data-filter-placeholder="Find a tag…" class="js-select-menu-tab" role="tab">Tags</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches" role="menu">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.01_hello_world/FetchWeatherTask.java"
               data-name="1.01_hello_world"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.01_hello_world">
                1.01_hello_world
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.02_add_list_item_forecast_layout/FetchWeatherTask.java"
               data-name="1.02_add_list_item_forecast_layout"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.02_add_list_item_forecast_layout">
                1.02_add_list_item_forecast_layout
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.03_update_fragment_layout/FetchWeatherTask.java"
               data-name="1.03_update_fragment_layout"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.03_update_fragment_layout">
                1.03_update_fragment_layout
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.04_add_dummy_data/FetchWeatherTask.java"
               data-name="1.04_add_dummy_data"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.04_add_dummy_data">
                1.04_add_dummy_data
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.05_create_arrayadapter/FetchWeatherTask.java"
               data-name="1.05_create_arrayadapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.05_create_arrayadapter">
                1.05_create_arrayadapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.06_attach_adapter/FetchWeatherTask.java"
               data-name="1.06_attach_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.06_attach_adapter">
                1.06_attach_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.01_add_network_code/FetchWeatherTask.java"
               data-name="2.01_add_network_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.01_add_network_code">
                2.01_add_network_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.02_refactor_forecast_fragment/FetchWeatherTask.java"
               data-name="2.02_refactor_forecast_fragment"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.02_refactor_forecast_fragment">
                2.02_refactor_forecast_fragment
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.03_add_refresh_xml/FetchWeatherTask.java"
               data-name="2.03_add_refresh_xml"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.03_add_refresh_xml">
                2.03_add_refresh_xml
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.04_inflate_menu/FetchWeatherTask.java"
               data-name="2.04_inflate_menu"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.04_inflate_menu">
                2.04_inflate_menu
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.05_execute_fetchweathertask/FetchWeatherTask.java"
               data-name="2.05_execute_fetchweathertask"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.05_execute_fetchweathertask">
                2.05_execute_fetchweathertask
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.06_add_internet_permissions/FetchWeatherTask.java"
               data-name="2.06_add_internet_permissions"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.06_add_internet_permissions">
                2.06_add_internet_permissions
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.07_build_url_with_params/FetchWeatherTask.java"
               data-name="2.07_build_url_with_params"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.07_build_url_with_params">
                2.07_build_url_with_params
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.08_json_parsing/FetchWeatherTask.java"
               data-name="2.08_json_parsing"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.08_json_parsing">
                2.08_json_parsing
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.09_display_data/FetchWeatherTask.java"
               data-name="2.09_display_data"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.09_display_data">
                2.09_display_data
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.00_remove_logging/FetchWeatherTask.java"
               data-name="3.00_remove_logging"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.00_remove_logging">
                3.00_remove_logging
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.01_add_toast/FetchWeatherTask.java"
               data-name="3.01_add_toast"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.01_add_toast">
                3.01_add_toast
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.02_create_detail_activity/FetchWeatherTask.java"
               data-name="3.02_create_detail_activity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.02_create_detail_activity">
                3.02_create_detail_activity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.03_launch_detail_activity/FetchWeatherTask.java"
               data-name="3.03_launch_detail_activity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.03_launch_detail_activity">
                3.03_launch_detail_activity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.04_populate_detail_text/FetchWeatherTask.java"
               data-name="3.04_populate_detail_text"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.04_populate_detail_text">
                3.04_populate_detail_text
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.05_add_settingsactivity/FetchWeatherTask.java"
               data-name="3.05_add_settingsactivity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.05_add_settingsactivity">
                3.05_add_settingsactivity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.06_launch_settings/FetchWeatherTask.java"
               data-name="3.06_launch_settings"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.06_launch_settings">
                3.06_launch_settings
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.07_add_locations_setting/FetchWeatherTask.java"
               data-name="3.07_add_locations_setting"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.07_add_locations_setting">
                3.07_add_locations_setting
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.08_inflate_settingsactivity/FetchWeatherTask.java"
               data-name="3.08_inflate_settingsactivity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.08_inflate_settingsactivity">
                3.08_inflate_settingsactivity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.09_location_from_prefs/FetchWeatherTask.java"
               data-name="3.09_location_from_prefs"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.09_location_from_prefs">
                3.09_location_from_prefs
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.10_refactor_fetch_weather/FetchWeatherTask.java"
               data-name="3.10_refactor_fetch_weather"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.10_refactor_fetch_weather">
                3.10_refactor_fetch_weather
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.11_add_units_setting/FetchWeatherTask.java"
               data-name="3.11_add_units_setting"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.11_add_units_setting">
                3.11_add_units_setting
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.12_add_map_intent/FetchWeatherTask.java"
               data-name="3.12_add_map_intent"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.12_add_map_intent">
                3.12_add_map_intent
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.13_add_share_action_provider/FetchWeatherTask.java"
               data-name="3.13_add_share_action_provider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.13_add_share_action_provider">
                3.13_add_share_action_provider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.01_life_cycle/FetchWeatherTask.java"
               data-name="4.01_life_cycle"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.01_life_cycle">
                4.01_life_cycle
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.02_start_code_for_lesson_4/FetchWeatherTask.java"
               data-name="4.02_start_code_for_lesson_4"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.02_start_code_for_lesson_4">
                4.02_start_code_for_lesson_4
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.03_define_contract_constants/FetchWeatherTask.java"
               data-name="4.03_define_contract_constants"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.03_define_contract_constants">
                4.03_define_contract_constants
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.04_location_database/FetchWeatherTask.java"
               data-name="4.04_location_database"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.04_location_database">
                4.04_location_database
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.05_test_location_table/FetchWeatherTask.java"
               data-name="4.05_test_location_table"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.05_test_location_table">
                4.05_test_location_table
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.06_test_weather_table/FetchWeatherTask.java"
               data-name="4.06_test_weather_table"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.06_test_weather_table">
                4.06_test_weather_table
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.07_start_code_content_provider/FetchWeatherTask.java"
               data-name="4.07_start_code_content_provider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.07_start_code_content_provider">
                4.07_start_code_content_provider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.08_uribuilder_weather_with_location/FetchWeatherTask.java"
               data-name="4.08_uribuilder_weather_with_location"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.08_uribuilder_weather_with_location">
                4.08_uribuilder_weather_with_location
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.09_write_uri_matcher/FetchWeatherTask.java"
               data-name="4.09_write_uri_matcher"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.09_write_uri_matcher">
                4.09_write_uri_matcher
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.10_register_contentprovider/FetchWeatherTask.java"
               data-name="4.10_register_contentprovider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.10_register_contentprovider">
                4.10_register_contentprovider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.11_gettype/FetchWeatherTask.java"
               data-name="4.11_gettype"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.11_gettype">
                4.11_gettype
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.12_query/FetchWeatherTask.java"
               data-name="4.12_query"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.12_query">
                4.12_query
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.13_insert/FetchWeatherTask.java"
               data-name="4.13_insert"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.13_insert">
                4.13_insert
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.14_update_delete/FetchWeatherTask.java"
               data-name="4.14_update_delete"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.14_update_delete">
                4.14_update_delete
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.15_refactor_fetchweather/FetchWeatherTask.java"
               data-name="4.15_refactor_fetchweather"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.15_refactor_fetchweather">
                4.15_refactor_fetchweather
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.16_use_contentprovider_inserts/FetchWeatherTask.java"
               data-name="4.16_use_contentprovider_inserts"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.16_use_contentprovider_inserts">
                4.16_use_contentprovider_inserts
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.17_bulkinserts_with_contentprovider/FetchWeatherTask.java"
               data-name="4.17_bulkinserts_with_contentprovider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.17_bulkinserts_with_contentprovider">
                4.17_bulkinserts_with_contentprovider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.18_cursor_adapter/FetchWeatherTask.java"
               data-name="4.18_cursor_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.18_cursor_adapter">
                4.18_cursor_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.19_loaders/FetchWeatherTask.java"
               data-name="4.19_loaders"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.19_loaders">
                4.19_loaders
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.20_projections/FetchWeatherTask.java"
               data-name="4.20_projections"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.20_projections">
                4.20_projections
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.21_details_view/FetchWeatherTask.java"
               data-name="4.21_details_view"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.21_details_view">
                4.21_details_view
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.22_fix_details_view/FetchWeatherTask.java"
               data-name="4.22_fix_details_view"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.22_fix_details_view">
                4.22_fix_details_view
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.23_fix_settings/FetchWeatherTask.java"
               data-name="4.23_fix_settings"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.23_fix_settings">
                4.23_fix_settings
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.01_build_list_item/FetchWeatherTask.java"
               data-name="5.01_build_list_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.01_build_list_item">
                5.01_build_list_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.02_build_today_item/FetchWeatherTask.java"
               data-name="5.02_build_today_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.02_build_today_item">
                5.02_build_today_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.03_update_forecast_adapter/FetchWeatherTask.java"
               data-name="5.03_update_forecast_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.03_update_forecast_adapter">
                5.03_update_forecast_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.04_two_item_view_types/FetchWeatherTask.java"
               data-name="5.04_two_item_view_types"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.04_two_item_view_types">
                5.04_two_item_view_types
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.05_viewholder/FetchWeatherTask.java"
               data-name="5.05_viewholder"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.05_viewholder">
                5.05_viewholder
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.06_formatting_strings/FetchWeatherTask.java"
               data-name="5.06_formatting_strings"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.06_formatting_strings">
                5.06_formatting_strings
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.07_details_screen/FetchWeatherTask.java"
               data-name="5.07_details_screen"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.07_details_screen">
                5.07_details_screen
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.08_images/FetchWeatherTask.java"
               data-name="5.08_images"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.08_images">
                5.08_images
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.09_two_pane_ui/FetchWeatherTask.java"
               data-name="5.09_two_pane_ui"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.09_two_pane_ui">
                5.09_two_pane_ui
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.10_selected_item/FetchWeatherTask.java"
               data-name="5.10_selected_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.10_selected_item">
                5.10_selected_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.11_activated_item/FetchWeatherTask.java"
               data-name="5.11_activated_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.11_activated_item">
                5.11_activated_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.12_scroll_position/FetchWeatherTask.java"
               data-name="5.12_scroll_position"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.12_scroll_position">
                5.12_scroll_position
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.13_alternative_detail_layout/FetchWeatherTask.java"
               data-name="5.13_alternative_detail_layout"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.13_alternative_detail_layout">
                5.13_alternative_detail_layout
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.14_today_item_tablet/FetchWeatherTask.java"
               data-name="5.14_today_item_tablet"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.14_today_item_tablet">
                5.14_today_item_tablet
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.15_action_bar/FetchWeatherTask.java"
               data-name="5.15_action_bar"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.15_action_bar">
                5.15_action_bar
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.16_settings_action_bar/FetchWeatherTask.java"
               data-name="5.16_settings_action_bar"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.16_settings_action_bar">
                5.16_settings_action_bar
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.17_redlines_list_item/FetchWeatherTask.java"
               data-name="5.17_redlines_list_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.17_redlines_list_item">
                5.17_redlines_list_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.18_redlines_finish/FetchWeatherTask.java"
               data-name="5.18_redlines_finish"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.18_redlines_finish">
                5.18_redlines_finish
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.19_accessibility/FetchWeatherTask.java"
               data-name="5.19_accessibility"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.19_accessibility">
                5.19_accessibility
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.01_services/FetchWeatherTask.java"
               data-name="6.01_services"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.01_services">
                6.01_services
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.02_alarms/FetchWeatherTask.java"
               data-name="6.02_alarms"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.02_alarms">
                6.02_alarms
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.03_implement_sync_adapter/FetchWeatherTask.java"
               data-name="6.03_implement_sync_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.03_implement_sync_adapter">
                6.03_implement_sync_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.04_finish_sync_adapter/FetchWeatherTask.java"
               data-name="6.04_finish_sync_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.04_finish_sync_adapter">
                6.04_finish_sync_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.05_scheduled_sync/FetchWeatherTask.java"
               data-name="6.05_scheduled_sync"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.05_scheduled_sync">
                6.05_scheduled_sync
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.06_notifications_quiz/FetchWeatherTask.java"
               data-name="6.06_notifications_quiz"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.06_notifications_quiz">
                6.06_notifications_quiz
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.07_notifications_answer/FetchWeatherTask.java"
               data-name="6.07_notifications_answer"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.07_notifications_answer">
                6.07_notifications_answer
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.08_turn_off_notifications/FetchWeatherTask.java"
               data-name="6.08_turn_off_notifications"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.08_turn_off_notifications">
                6.08_turn_off_notifications
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.09_delete_old_data/FetchWeatherTask.java"
               data-name="6.09_delete_old_data"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.09_delete_old_data">
                6.09_delete_old_data
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.10_update_map_intent/FetchWeatherTask.java"
               data-name="6.10_update_map_intent"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.10_update_map_intent">
                6.10_update_map_intent
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/initial_commit/FetchWeatherTask.java"
               data-name="initial_commit"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="initial_commit">
                initial_commit
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open selected"
               href="/udacity/Sunshine-Version-2/blob/lesson_4_content_provider_starter_code/FetchWeatherTask.java"
               data-name="lesson_4_content_provider_starter_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="lesson_4_content_provider_starter_code">
                lesson_4_content_provider_starter_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/lesson_4_starter_code/FetchWeatherTask.java"
               data-name="lesson_4_starter_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="lesson_4_starter_code">
                lesson_4_starter_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/lesson_6_sync_adapter_starter_code/FetchWeatherTask.java"
               data-name="lesson_6_sync_adapter_starter_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="lesson_6_sync_adapter_starter_code">
                lesson_6_sync_adapter_starter_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/sunshine_master/FetchWeatherTask.java"
               data-name="sunshine_master"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="sunshine_master">
                sunshine_master
              </span>
            </a>
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div>

    </div>
  </div>
</div>

    <div class="btn-group right">
      <a href="/udacity/Sunshine-Version-2/find/lesson_4_content_provider_starter_code"
            class="js-show-file-finder btn btn-sm empty-icon tooltipped tooltipped-nw"
            data-pjax
            data-hotkey="t"
            aria-label="Quickly jump between files">
        <span class="octicon octicon-list-unordered"></span>
      </a>
      <button aria-label="Copy file path to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </div>

    <div class="breadcrumb js-zeroclipboard-target">
      <span class="repo-root js-repo-root"><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/udacity/Sunshine-Version-2/tree/lesson_4_content_provider_starter_code" class="" data-branch="lesson_4_content_provider_starter_code" data-pjax="true" itemscope="url"><span itemprop="title">Sunshine-Version-2</span></a></span></span><span class="separator">/</span><strong class="final-path">FetchWeatherTask.java</strong>
    </div>
  </div>


  <div class="commit file-history-tease">
    <div class="file-history-tease-header">
        <img alt="@ceruleanotter" class="avatar" data-user="3414789" height="24" src="https://avatars0.githubusercontent.com/u/3414789?v=3&amp;s=48" width="24" />
        <span class="author"><a href="/ceruleanotter" rel="contributor">ceruleanotter</a></span>
        <time datetime="2015-03-04T23:54:47Z" is="relative-time">Mar 4, 2015</time>
        <div class="commit-title">
            <a href="/udacity/Sunshine-Version-2/commit/1578a360189e9e929004894ed3e8f2210b7db8a7" class="message" data-pjax="true" title="Starter code for 4B, the Content Provider Lesson">Starter code for 4B, the Content Provider Lesson</a>
        </div>
    </div>

    <div class="participation">
      <p class="quickstat">
        <a href="#blob_contributors_box" rel="facebox">
          <strong>1</strong>
           contributor
        </a>
      </p>
      
    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list">
          <li class="facebox-user-list-item">
            <img alt="@ceruleanotter" data-user="3414789" height="24" src="https://avatars0.githubusercontent.com/u/3414789?v=3&amp;s=48" width="24" />
            <a href="/ceruleanotter">ceruleanotter</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file">
  <div class="file-header">
    <div class="file-actions">

      <div class="btn-group">
        <a href="/udacity/Sunshine-Version-2/raw/lesson_4_content_provider_starter_code/FetchWeatherTask.java" class="btn btn-sm " id="raw-url">Raw</a>
          <a href="/udacity/Sunshine-Version-2/blame/lesson_4_content_provider_starter_code/FetchWeatherTask.java" class="btn btn-sm js-update-url-with-hash">Blame</a>
        <a href="/udacity/Sunshine-Version-2/commits/lesson_4_content_provider_starter_code/FetchWeatherTask.java" class="btn btn-sm " rel="nofollow">History</a>
      </div>

        <a class="octicon-btn tooltipped tooltipped-nw"
           href="https://windows.github.com"
           aria-label="Open this file in GitHub for Windows"
           data-ga-click="Repository, open with desktop, type:windows">
            <span class="octicon octicon-device-desktop"></span>
        </a>

          <button type="button" class="octicon-btn disabled tooltipped tooltipped-n" aria-label="You must be signed in to make or propose changes">
            <span class="octicon octicon-pencil"></span>
          </button>

        <button type="button" class="octicon-btn octicon-btn-danger disabled tooltipped tooltipped-n" aria-label="You must be signed in to make or propose changes">
          <span class="octicon octicon-trashcan"></span>
        </button>
    </div>

    <div class="file-info">
        408 lines (341 sloc)
        <span class="file-info-divider"></span>
      16.854 kB
    </div>
  </div>
  

  <div class="blob-wrapper data type-java">
      <table class="highlight tab-size js-file-line-container" data-tab-size="8">
      <tr>
        <td id="L1" class="blob-num js-line-number" data-line-number="1"></td>
        <td id="LC1" class="blob-code blob-code-inner js-file-line"><span class="pl-c">/*</span></td>
      </tr>
      <tr>
        <td id="L2" class="blob-num js-line-number" data-line-number="2"></td>
        <td id="LC2" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * Copyright (C) 2014 The Android Open Source Project</span></td>
      </tr>
      <tr>
        <td id="L3" class="blob-num js-line-number" data-line-number="3"></td>
        <td id="LC3" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> *</span></td>
      </tr>
      <tr>
        <td id="L4" class="blob-num js-line-number" data-line-number="4"></td>
        <td id="LC4" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);</span></td>
      </tr>
      <tr>
        <td id="L5" class="blob-num js-line-number" data-line-number="5"></td>
        <td id="LC5" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * you may not use this file except in compliance with the License.</span></td>
      </tr>
      <tr>
        <td id="L6" class="blob-num js-line-number" data-line-number="6"></td>
        <td id="LC6" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * You may obtain a copy of the License at</span></td>
      </tr>
      <tr>
        <td id="L7" class="blob-num js-line-number" data-line-number="7"></td>
        <td id="LC7" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> *</span></td>
      </tr>
      <tr>
        <td id="L8" class="blob-num js-line-number" data-line-number="8"></td>
        <td id="LC8" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> *      http://www.apache.org/licenses/LICENSE-2.0</span></td>
      </tr>
      <tr>
        <td id="L9" class="blob-num js-line-number" data-line-number="9"></td>
        <td id="LC9" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> *</span></td>
      </tr>
      <tr>
        <td id="L10" class="blob-num js-line-number" data-line-number="10"></td>
        <td id="LC10" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * Unless required by applicable law or agreed to in writing, software</span></td>
      </tr>
      <tr>
        <td id="L11" class="blob-num js-line-number" data-line-number="11"></td>
        <td id="LC11" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,</span></td>
      </tr>
      <tr>
        <td id="L12" class="blob-num js-line-number" data-line-number="12"></td>
        <td id="LC12" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.</span></td>
      </tr>
      <tr>
        <td id="L13" class="blob-num js-line-number" data-line-number="13"></td>
        <td id="LC13" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * See the License for the specific language governing permissions and</span></td>
      </tr>
      <tr>
        <td id="L14" class="blob-num js-line-number" data-line-number="14"></td>
        <td id="LC14" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * limitations under the License.</span></td>
      </tr>
      <tr>
        <td id="L15" class="blob-num js-line-number" data-line-number="15"></td>
        <td id="LC15" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> */</span></td>
      </tr>
      <tr>
        <td id="L16" class="blob-num js-line-number" data-line-number="16"></td>
        <td id="LC16" class="blob-code blob-code-inner js-file-line"><span class="pl-k">package</span> <span class="pl-smi">com.example.android.sunshine.app</span>;</td>
      </tr>
      <tr>
        <td id="L17" class="blob-num js-line-number" data-line-number="17"></td>
        <td id="LC17" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L18" class="blob-num js-line-number" data-line-number="18"></td>
        <td id="LC18" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.content.ContentValues</span>;</td>
      </tr>
      <tr>
        <td id="L19" class="blob-num js-line-number" data-line-number="19"></td>
        <td id="LC19" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.content.Context</span>;</td>
      </tr>
      <tr>
        <td id="L20" class="blob-num js-line-number" data-line-number="20"></td>
        <td id="LC20" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.content.SharedPreferences</span>;</td>
      </tr>
      <tr>
        <td id="L21" class="blob-num js-line-number" data-line-number="21"></td>
        <td id="LC21" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.net.Uri</span>;</td>
      </tr>
      <tr>
        <td id="L22" class="blob-num js-line-number" data-line-number="22"></td>
        <td id="LC22" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.os.AsyncTask</span>;</td>
      </tr>
      <tr>
        <td id="L23" class="blob-num js-line-number" data-line-number="23"></td>
        <td id="LC23" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.preference.PreferenceManager</span>;</td>
      </tr>
      <tr>
        <td id="L24" class="blob-num js-line-number" data-line-number="24"></td>
        <td id="LC24" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.text.format.Time</span>;</td>
      </tr>
      <tr>
        <td id="L25" class="blob-num js-line-number" data-line-number="25"></td>
        <td id="LC25" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.util.Log</span>;</td>
      </tr>
      <tr>
        <td id="L26" class="blob-num js-line-number" data-line-number="26"></td>
        <td id="LC26" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.widget.ArrayAdapter</span>;</td>
      </tr>
      <tr>
        <td id="L27" class="blob-num js-line-number" data-line-number="27"></td>
        <td id="LC27" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L28" class="blob-num js-line-number" data-line-number="28"></td>
        <td id="LC28" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">com.example.android.sunshine.app.data.WeatherContract.WeatherEntry</span>;</td>
      </tr>
      <tr>
        <td id="L29" class="blob-num js-line-number" data-line-number="29"></td>
        <td id="LC29" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L30" class="blob-num js-line-number" data-line-number="30"></td>
        <td id="LC30" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">org.json.JSONArray</span>;</td>
      </tr>
      <tr>
        <td id="L31" class="blob-num js-line-number" data-line-number="31"></td>
        <td id="LC31" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">org.json.JSONException</span>;</td>
      </tr>
      <tr>
        <td id="L32" class="blob-num js-line-number" data-line-number="32"></td>
        <td id="LC32" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">org.json.JSONObject</span>;</td>
      </tr>
      <tr>
        <td id="L33" class="blob-num js-line-number" data-line-number="33"></td>
        <td id="LC33" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L34" class="blob-num js-line-number" data-line-number="34"></td>
        <td id="LC34" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.io.BufferedReader</span>;</td>
      </tr>
      <tr>
        <td id="L35" class="blob-num js-line-number" data-line-number="35"></td>
        <td id="LC35" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.io.IOException</span>;</td>
      </tr>
      <tr>
        <td id="L36" class="blob-num js-line-number" data-line-number="36"></td>
        <td id="LC36" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.io.InputStream</span>;</td>
      </tr>
      <tr>
        <td id="L37" class="blob-num js-line-number" data-line-number="37"></td>
        <td id="LC37" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.io.InputStreamReader</span>;</td>
      </tr>
      <tr>
        <td id="L38" class="blob-num js-line-number" data-line-number="38"></td>
        <td id="LC38" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.net.HttpURLConnection</span>;</td>
      </tr>
      <tr>
        <td id="L39" class="blob-num js-line-number" data-line-number="39"></td>
        <td id="LC39" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.net.URL</span>;</td>
      </tr>
      <tr>
        <td id="L40" class="blob-num js-line-number" data-line-number="40"></td>
        <td id="LC40" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.text.SimpleDateFormat</span>;</td>
      </tr>
      <tr>
        <td id="L41" class="blob-num js-line-number" data-line-number="41"></td>
        <td id="LC41" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.util.Date</span>;</td>
      </tr>
      <tr>
        <td id="L42" class="blob-num js-line-number" data-line-number="42"></td>
        <td id="LC42" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">java.util.Vector</span>;</td>
      </tr>
      <tr>
        <td id="L43" class="blob-num js-line-number" data-line-number="43"></td>
        <td id="LC43" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L44" class="blob-num js-line-number" data-line-number="44"></td>
        <td id="LC44" class="blob-code blob-code-inner js-file-line"><span class="pl-k">public</span> <span class="pl-k">class</span> <span class="pl-en">FetchWeatherTask</span> <span class="pl-k">extends</span> <span class="pl-e">AsyncTask&lt;<span class="pl-smi">String</span>, <span class="pl-smi">Void</span>, <span class="pl-k">String</span>[</span>]&gt; {</td>
      </tr>
      <tr>
        <td id="L45" class="blob-num js-line-number" data-line-number="45"></td>
        <td id="LC45" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L46" class="blob-num js-line-number" data-line-number="46"></td>
        <td id="LC46" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">LOG_TAG</span> <span class="pl-k">=</span> <span class="pl-smi">FetchWeatherTask</span><span class="pl-k">.</span>class<span class="pl-k">.</span>getSimpleName();</td>
      </tr>
      <tr>
        <td id="L47" class="blob-num js-line-number" data-line-number="47"></td>
        <td id="LC47" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L48" class="blob-num js-line-number" data-line-number="48"></td>
        <td id="LC48" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">ArrayAdapter&lt;<span class="pl-smi">String</span>&gt;</span> mForecastAdapter;</td>
      </tr>
      <tr>
        <td id="L49" class="blob-num js-line-number" data-line-number="49"></td>
        <td id="LC49" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">final</span> <span class="pl-smi">Context</span> mContext;</td>
      </tr>
      <tr>
        <td id="L50" class="blob-num js-line-number" data-line-number="50"></td>
        <td id="LC50" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L51" class="blob-num js-line-number" data-line-number="51"></td>
        <td id="LC51" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">public</span> <span class="pl-en">FetchWeatherTask</span>(<span class="pl-smi">Context</span> <span class="pl-v">context</span>, <span class="pl-k">ArrayAdapter&lt;<span class="pl-smi">String</span>&gt;</span> <span class="pl-v">forecastAdapter</span>) {</td>
      </tr>
      <tr>
        <td id="L52" class="blob-num js-line-number" data-line-number="52"></td>
        <td id="LC52" class="blob-code blob-code-inner js-file-line">        mContext <span class="pl-k">=</span> context;</td>
      </tr>
      <tr>
        <td id="L53" class="blob-num js-line-number" data-line-number="53"></td>
        <td id="LC53" class="blob-code blob-code-inner js-file-line">        mForecastAdapter <span class="pl-k">=</span> forecastAdapter;</td>
      </tr>
      <tr>
        <td id="L54" class="blob-num js-line-number" data-line-number="54"></td>
        <td id="LC54" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L55" class="blob-num js-line-number" data-line-number="55"></td>
        <td id="LC55" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L56" class="blob-num js-line-number" data-line-number="56"></td>
        <td id="LC56" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">boolean</span> <span class="pl-c1">DEBUG</span> <span class="pl-k">=</span> <span class="pl-c1">true</span>;</td>
      </tr>
      <tr>
        <td id="L57" class="blob-num js-line-number" data-line-number="57"></td>
        <td id="LC57" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L58" class="blob-num js-line-number" data-line-number="58"></td>
        <td id="LC58" class="blob-code blob-code-inner js-file-line">    <span class="pl-c">/* The date/time conversion code is going to be moved outside the asynctask later,</span></td>
      </tr>
      <tr>
        <td id="L59" class="blob-num js-line-number" data-line-number="59"></td>
        <td id="LC59" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     * so for convenience we&#39;re breaking it out into its own method now.</span></td>
      </tr>
      <tr>
        <td id="L60" class="blob-num js-line-number" data-line-number="60"></td>
        <td id="LC60" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     */</span></td>
      </tr>
      <tr>
        <td id="L61" class="blob-num js-line-number" data-line-number="61"></td>
        <td id="LC61" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">String</span> <span class="pl-en">getReadableDateString</span>(<span class="pl-k">long</span> <span class="pl-v">time</span>){</td>
      </tr>
      <tr>
        <td id="L62" class="blob-num js-line-number" data-line-number="62"></td>
        <td id="LC62" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// Because the API returns a unix timestamp (measured in seconds),</span></td>
      </tr>
      <tr>
        <td id="L63" class="blob-num js-line-number" data-line-number="63"></td>
        <td id="LC63" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// it must be converted to milliseconds in order to be converted to valid date.</span></td>
      </tr>
      <tr>
        <td id="L64" class="blob-num js-line-number" data-line-number="64"></td>
        <td id="LC64" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">Date</span> date <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Date</span>(time);</td>
      </tr>
      <tr>
        <td id="L65" class="blob-num js-line-number" data-line-number="65"></td>
        <td id="LC65" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">SimpleDateFormat</span> format <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">SimpleDateFormat</span>(<span class="pl-s"><span class="pl-pds">&quot;</span>E, MMM d<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L66" class="blob-num js-line-number" data-line-number="66"></td>
        <td id="LC66" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">return</span> format<span class="pl-k">.</span>format(date)<span class="pl-k">.</span>toString();</td>
      </tr>
      <tr>
        <td id="L67" class="blob-num js-line-number" data-line-number="67"></td>
        <td id="LC67" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L68" class="blob-num js-line-number" data-line-number="68"></td>
        <td id="LC68" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L69" class="blob-num js-line-number" data-line-number="69"></td>
        <td id="LC69" class="blob-code blob-code-inner js-file-line">    <span class="pl-c">/**</span></td>
      </tr>
      <tr>
        <td id="L70" class="blob-num js-line-number" data-line-number="70"></td>
        <td id="LC70" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     * Prepare the weather high/lows for presentation.</span></td>
      </tr>
      <tr>
        <td id="L71" class="blob-num js-line-number" data-line-number="71"></td>
        <td id="LC71" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     */</span></td>
      </tr>
      <tr>
        <td id="L72" class="blob-num js-line-number" data-line-number="72"></td>
        <td id="LC72" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-smi">String</span> <span class="pl-en">formatHighLows</span>(<span class="pl-k">double</span> <span class="pl-v">high</span>, <span class="pl-k">double</span> <span class="pl-v">low</span>) {</td>
      </tr>
      <tr>
        <td id="L73" class="blob-num js-line-number" data-line-number="73"></td>
        <td id="LC73" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// Data is fetched in Celsius by default.</span></td>
      </tr>
      <tr>
        <td id="L74" class="blob-num js-line-number" data-line-number="74"></td>
        <td id="LC74" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// If user prefers to see in Fahrenheit, convert the values here.</span></td>
      </tr>
      <tr>
        <td id="L75" class="blob-num js-line-number" data-line-number="75"></td>
        <td id="LC75" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// We do this rather than fetching in Fahrenheit so that the user can</span></td>
      </tr>
      <tr>
        <td id="L76" class="blob-num js-line-number" data-line-number="76"></td>
        <td id="LC76" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// change this option without us having to re-fetch the data once</span></td>
      </tr>
      <tr>
        <td id="L77" class="blob-num js-line-number" data-line-number="77"></td>
        <td id="LC77" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// we start storing the values in a database.</span></td>
      </tr>
      <tr>
        <td id="L78" class="blob-num js-line-number" data-line-number="78"></td>
        <td id="LC78" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">SharedPreferences</span> sharedPrefs <span class="pl-k">=</span></td>
      </tr>
      <tr>
        <td id="L79" class="blob-num js-line-number" data-line-number="79"></td>
        <td id="LC79" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">PreferenceManager</span><span class="pl-k">.</span>getDefaultSharedPreferences(mContext);</td>
      </tr>
      <tr>
        <td id="L80" class="blob-num js-line-number" data-line-number="80"></td>
        <td id="LC80" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">String</span> unitType <span class="pl-k">=</span> sharedPrefs<span class="pl-k">.</span>getString(</td>
      </tr>
      <tr>
        <td id="L81" class="blob-num js-line-number" data-line-number="81"></td>
        <td id="LC81" class="blob-code blob-code-inner js-file-line">                mContext<span class="pl-k">.</span>getString(<span class="pl-smi">R</span><span class="pl-k">.</span>string<span class="pl-k">.</span>pref_units_key),</td>
      </tr>
      <tr>
        <td id="L82" class="blob-num js-line-number" data-line-number="82"></td>
        <td id="LC82" class="blob-code blob-code-inner js-file-line">                mContext<span class="pl-k">.</span>getString(<span class="pl-smi">R</span><span class="pl-k">.</span>string<span class="pl-k">.</span>pref_units_metric));</td>
      </tr>
      <tr>
        <td id="L83" class="blob-num js-line-number" data-line-number="83"></td>
        <td id="LC83" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L84" class="blob-num js-line-number" data-line-number="84"></td>
        <td id="LC84" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span> (unitType<span class="pl-k">.</span>equals(mContext<span class="pl-k">.</span>getString(<span class="pl-smi">R</span><span class="pl-k">.</span>string<span class="pl-k">.</span>pref_units_imperial))) {</td>
      </tr>
      <tr>
        <td id="L85" class="blob-num js-line-number" data-line-number="85"></td>
        <td id="LC85" class="blob-code blob-code-inner js-file-line">            high <span class="pl-k">=</span> (high <span class="pl-k">*</span> <span class="pl-c1">1.8</span>) <span class="pl-k">+</span> <span class="pl-c1">32</span>;</td>
      </tr>
      <tr>
        <td id="L86" class="blob-num js-line-number" data-line-number="86"></td>
        <td id="LC86" class="blob-code blob-code-inner js-file-line">            low <span class="pl-k">=</span> (low <span class="pl-k">*</span> <span class="pl-c1">1.8</span>) <span class="pl-k">+</span> <span class="pl-c1">32</span>;</td>
      </tr>
      <tr>
        <td id="L87" class="blob-num js-line-number" data-line-number="87"></td>
        <td id="LC87" class="blob-code blob-code-inner js-file-line">        } <span class="pl-k">else</span> <span class="pl-k">if</span> (<span class="pl-k">!</span>unitType<span class="pl-k">.</span>equals(mContext<span class="pl-k">.</span>getString(<span class="pl-smi">R</span><span class="pl-k">.</span>string<span class="pl-k">.</span>pref_units_metric))) {</td>
      </tr>
      <tr>
        <td id="L88" class="blob-num js-line-number" data-line-number="88"></td>
        <td id="LC88" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">Log</span><span class="pl-k">.</span>d(<span class="pl-c1">LOG_TAG</span>, <span class="pl-s"><span class="pl-pds">&quot;</span>Unit type not found: <span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> unitType);</td>
      </tr>
      <tr>
        <td id="L89" class="blob-num js-line-number" data-line-number="89"></td>
        <td id="LC89" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L90" class="blob-num js-line-number" data-line-number="90"></td>
        <td id="LC90" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L91" class="blob-num js-line-number" data-line-number="91"></td>
        <td id="LC91" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// For presentation, assume the user doesn&#39;t care about tenths of a degree.</span></td>
      </tr>
      <tr>
        <td id="L92" class="blob-num js-line-number" data-line-number="92"></td>
        <td id="LC92" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">long</span> roundedHigh <span class="pl-k">=</span> <span class="pl-smi">Math</span><span class="pl-k">.</span>round(high);</td>
      </tr>
      <tr>
        <td id="L93" class="blob-num js-line-number" data-line-number="93"></td>
        <td id="LC93" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">long</span> roundedLow <span class="pl-k">=</span> <span class="pl-smi">Math</span><span class="pl-k">.</span>round(low);</td>
      </tr>
      <tr>
        <td id="L94" class="blob-num js-line-number" data-line-number="94"></td>
        <td id="LC94" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L95" class="blob-num js-line-number" data-line-number="95"></td>
        <td id="LC95" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">String</span> highLowStr <span class="pl-k">=</span> roundedHigh <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span>/<span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> roundedLow;</td>
      </tr>
      <tr>
        <td id="L96" class="blob-num js-line-number" data-line-number="96"></td>
        <td id="LC96" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">return</span> highLowStr;</td>
      </tr>
      <tr>
        <td id="L97" class="blob-num js-line-number" data-line-number="97"></td>
        <td id="LC97" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L98" class="blob-num js-line-number" data-line-number="98"></td>
        <td id="LC98" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L99" class="blob-num js-line-number" data-line-number="99"></td>
        <td id="LC99" class="blob-code blob-code-inner js-file-line">    <span class="pl-c">/**</span></td>
      </tr>
      <tr>
        <td id="L100" class="blob-num js-line-number" data-line-number="100"></td>
        <td id="LC100" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     * Helper method to handle insertion of a new location in the weather database.</span></td>
      </tr>
      <tr>
        <td id="L101" class="blob-num js-line-number" data-line-number="101"></td>
        <td id="LC101" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     *</span></td>
      </tr>
      <tr>
        <td id="L102" class="blob-num js-line-number" data-line-number="102"></td>
        <td id="LC102" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     * @param locationSetting The location string used to request updates from the server.</span></td>
      </tr>
      <tr>
        <td id="L103" class="blob-num js-line-number" data-line-number="103"></td>
        <td id="LC103" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     * @param cityName A human-readable city name, e.g &quot;Mountain View&quot;</span></td>
      </tr>
      <tr>
        <td id="L104" class="blob-num js-line-number" data-line-number="104"></td>
        <td id="LC104" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     * @param lat the latitude of the city</span></td>
      </tr>
      <tr>
        <td id="L105" class="blob-num js-line-number" data-line-number="105"></td>
        <td id="LC105" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     * @param lon the longitude of the city</span></td>
      </tr>
      <tr>
        <td id="L106" class="blob-num js-line-number" data-line-number="106"></td>
        <td id="LC106" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     * @return the row ID of the added location.</span></td>
      </tr>
      <tr>
        <td id="L107" class="blob-num js-line-number" data-line-number="107"></td>
        <td id="LC107" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     */</span></td>
      </tr>
      <tr>
        <td id="L108" class="blob-num js-line-number" data-line-number="108"></td>
        <td id="LC108" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">long</span> <span class="pl-en">addLocation</span>(<span class="pl-smi">String</span> <span class="pl-v">locationSetting</span>, <span class="pl-smi">String</span> <span class="pl-v">cityName</span>, <span class="pl-k">double</span> <span class="pl-v">lat</span>, <span class="pl-k">double</span> <span class="pl-v">lon</span>) {</td>
      </tr>
      <tr>
        <td id="L109" class="blob-num js-line-number" data-line-number="109"></td>
        <td id="LC109" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// Students: First, check if the location with this city name exists in the db</span></td>
      </tr>
      <tr>
        <td id="L110" class="blob-num js-line-number" data-line-number="110"></td>
        <td id="LC110" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// If it exists, return the current ID</span></td>
      </tr>
      <tr>
        <td id="L111" class="blob-num js-line-number" data-line-number="111"></td>
        <td id="LC111" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// Otherwise, insert it using the content resolver and the base URI</span></td>
      </tr>
      <tr>
        <td id="L112" class="blob-num js-line-number" data-line-number="112"></td>
        <td id="LC112" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">return</span> <span class="pl-k">-</span><span class="pl-c1">1</span>;</td>
      </tr>
      <tr>
        <td id="L113" class="blob-num js-line-number" data-line-number="113"></td>
        <td id="LC113" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L114" class="blob-num js-line-number" data-line-number="114"></td>
        <td id="LC114" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L115" class="blob-num js-line-number" data-line-number="115"></td>
        <td id="LC115" class="blob-code blob-code-inner js-file-line">    <span class="pl-c">/*</span></td>
      </tr>
      <tr>
        <td id="L116" class="blob-num js-line-number" data-line-number="116"></td>
        <td id="LC116" class="blob-code blob-code-inner js-file-line"><span class="pl-c">        Students: This code will allow the FetchWeatherTask to continue to return the strings that</span></td>
      </tr>
      <tr>
        <td id="L117" class="blob-num js-line-number" data-line-number="117"></td>
        <td id="LC117" class="blob-code blob-code-inner js-file-line"><span class="pl-c">        the UX expects so that we can continue to test the application even once we begin using</span></td>
      </tr>
      <tr>
        <td id="L118" class="blob-num js-line-number" data-line-number="118"></td>
        <td id="LC118" class="blob-code blob-code-inner js-file-line"><span class="pl-c">        the database.</span></td>
      </tr>
      <tr>
        <td id="L119" class="blob-num js-line-number" data-line-number="119"></td>
        <td id="LC119" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     */</span></td>
      </tr>
      <tr>
        <td id="L120" class="blob-num js-line-number" data-line-number="120"></td>
        <td id="LC120" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">String</span>[] <span class="pl-en">convertContentValuesToUXFormat</span>(<span class="pl-k">Vector&lt;<span class="pl-smi">ContentValues</span>&gt;</span> <span class="pl-v">cvv</span>) {</td>
      </tr>
      <tr>
        <td id="L121" class="blob-num js-line-number" data-line-number="121"></td>
        <td id="LC121" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// return strings to keep UI functional for now</span></td>
      </tr>
      <tr>
        <td id="L122" class="blob-num js-line-number" data-line-number="122"></td>
        <td id="LC122" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">String</span>[] resultStrs <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">String</span>[cvv<span class="pl-k">.</span>size()];</td>
      </tr>
      <tr>
        <td id="L123" class="blob-num js-line-number" data-line-number="123"></td>
        <td id="LC123" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">for</span> ( <span class="pl-k">int</span> i <span class="pl-k">=</span> <span class="pl-c1">0</span>; i <span class="pl-k">&lt;</span> cvv<span class="pl-k">.</span>size(); i<span class="pl-k">++</span> ) {</td>
      </tr>
      <tr>
        <td id="L124" class="blob-num js-line-number" data-line-number="124"></td>
        <td id="LC124" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">ContentValues</span> weatherValues <span class="pl-k">=</span> cvv<span class="pl-k">.</span>elementAt(i);</td>
      </tr>
      <tr>
        <td id="L125" class="blob-num js-line-number" data-line-number="125"></td>
        <td id="LC125" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">String</span> highAndLow <span class="pl-k">=</span> formatHighLows(</td>
      </tr>
      <tr>
        <td id="L126" class="blob-num js-line-number" data-line-number="126"></td>
        <td id="LC126" class="blob-code blob-code-inner js-file-line">                    weatherValues<span class="pl-k">.</span>getAsDouble(<span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>COLUMN_MAX_TEMP</span>),</td>
      </tr>
      <tr>
        <td id="L127" class="blob-num js-line-number" data-line-number="127"></td>
        <td id="LC127" class="blob-code blob-code-inner js-file-line">                    weatherValues<span class="pl-k">.</span>getAsDouble(<span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>COLUMN_MIN_TEMP</span>));</td>
      </tr>
      <tr>
        <td id="L128" class="blob-num js-line-number" data-line-number="128"></td>
        <td id="LC128" class="blob-code blob-code-inner js-file-line">            resultStrs[i] <span class="pl-k">=</span> getReadableDateString(</td>
      </tr>
      <tr>
        <td id="L129" class="blob-num js-line-number" data-line-number="129"></td>
        <td id="LC129" class="blob-code blob-code-inner js-file-line">                    weatherValues<span class="pl-k">.</span>getAsLong(<span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>COLUMN_DATE</span>)) <span class="pl-k">+</span></td>
      </tr>
      <tr>
        <td id="L130" class="blob-num js-line-number" data-line-number="130"></td>
        <td id="LC130" class="blob-code blob-code-inner js-file-line">                    <span class="pl-s"><span class="pl-pds">&quot;</span> - <span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> weatherValues<span class="pl-k">.</span>getAsString(<span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>COLUMN_SHORT_DESC</span>) <span class="pl-k">+</span></td>
      </tr>
      <tr>
        <td id="L131" class="blob-num js-line-number" data-line-number="131"></td>
        <td id="LC131" class="blob-code blob-code-inner js-file-line">                    <span class="pl-s"><span class="pl-pds">&quot;</span> - <span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> highAndLow;</td>
      </tr>
      <tr>
        <td id="L132" class="blob-num js-line-number" data-line-number="132"></td>
        <td id="LC132" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L133" class="blob-num js-line-number" data-line-number="133"></td>
        <td id="LC133" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">return</span> resultStrs;</td>
      </tr>
      <tr>
        <td id="L134" class="blob-num js-line-number" data-line-number="134"></td>
        <td id="LC134" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L135" class="blob-num js-line-number" data-line-number="135"></td>
        <td id="LC135" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L136" class="blob-num js-line-number" data-line-number="136"></td>
        <td id="LC136" class="blob-code blob-code-inner js-file-line">    <span class="pl-c">/**</span></td>
      </tr>
      <tr>
        <td id="L137" class="blob-num js-line-number" data-line-number="137"></td>
        <td id="LC137" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     * Take the String representing the complete forecast in JSON Format and</span></td>
      </tr>
      <tr>
        <td id="L138" class="blob-num js-line-number" data-line-number="138"></td>
        <td id="LC138" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     * pull out the data we need to construct the Strings needed for the wireframes.</span></td>
      </tr>
      <tr>
        <td id="L139" class="blob-num js-line-number" data-line-number="139"></td>
        <td id="LC139" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     *</span></td>
      </tr>
      <tr>
        <td id="L140" class="blob-num js-line-number" data-line-number="140"></td>
        <td id="LC140" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     * Fortunately parsing is easy:  constructor takes the JSON string and converts it</span></td>
      </tr>
      <tr>
        <td id="L141" class="blob-num js-line-number" data-line-number="141"></td>
        <td id="LC141" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     * into an Object hierarchy for us.</span></td>
      </tr>
      <tr>
        <td id="L142" class="blob-num js-line-number" data-line-number="142"></td>
        <td id="LC142" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     */</span></td>
      </tr>
      <tr>
        <td id="L143" class="blob-num js-line-number" data-line-number="143"></td>
        <td id="LC143" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">String</span>[] <span class="pl-en">getWeatherDataFromJson</span>(<span class="pl-smi">String</span> <span class="pl-v">forecastJsonStr</span>,</td>
      </tr>
      <tr>
        <td id="L144" class="blob-num js-line-number" data-line-number="144"></td>
        <td id="LC144" class="blob-code blob-code-inner js-file-line">                                            <span class="pl-smi">String</span> <span class="pl-v">locationSetting</span>)</td>
      </tr>
      <tr>
        <td id="L145" class="blob-num js-line-number" data-line-number="145"></td>
        <td id="LC145" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">throws</span> <span class="pl-smi">JSONException</span> {</td>
      </tr>
      <tr>
        <td id="L146" class="blob-num js-line-number" data-line-number="146"></td>
        <td id="LC146" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L147" class="blob-num js-line-number" data-line-number="147"></td>
        <td id="LC147" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// Now we have a String representing the complete forecast in JSON Format.</span></td>
      </tr>
      <tr>
        <td id="L148" class="blob-num js-line-number" data-line-number="148"></td>
        <td id="LC148" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// Fortunately parsing is easy:  constructor takes the JSON string and converts it</span></td>
      </tr>
      <tr>
        <td id="L149" class="blob-num js-line-number" data-line-number="149"></td>
        <td id="LC149" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// into an Object hierarchy for us.</span></td>
      </tr>
      <tr>
        <td id="L150" class="blob-num js-line-number" data-line-number="150"></td>
        <td id="LC150" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L151" class="blob-num js-line-number" data-line-number="151"></td>
        <td id="LC151" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// These are the names of the JSON objects that need to be extracted.</span></td>
      </tr>
      <tr>
        <td id="L152" class="blob-num js-line-number" data-line-number="152"></td>
        <td id="LC152" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L153" class="blob-num js-line-number" data-line-number="153"></td>
        <td id="LC153" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// Location information</span></td>
      </tr>
      <tr>
        <td id="L154" class="blob-num js-line-number" data-line-number="154"></td>
        <td id="LC154" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_CITY</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>city<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L155" class="blob-num js-line-number" data-line-number="155"></td>
        <td id="LC155" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_CITY_NAME</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>name<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L156" class="blob-num js-line-number" data-line-number="156"></td>
        <td id="LC156" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_COORD</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>coord<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L157" class="blob-num js-line-number" data-line-number="157"></td>
        <td id="LC157" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L158" class="blob-num js-line-number" data-line-number="158"></td>
        <td id="LC158" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// Location coordinate</span></td>
      </tr>
      <tr>
        <td id="L159" class="blob-num js-line-number" data-line-number="159"></td>
        <td id="LC159" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_LATITUDE</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>lat<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L160" class="blob-num js-line-number" data-line-number="160"></td>
        <td id="LC160" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_LONGITUDE</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>lon<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L161" class="blob-num js-line-number" data-line-number="161"></td>
        <td id="LC161" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L162" class="blob-num js-line-number" data-line-number="162"></td>
        <td id="LC162" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// Weather information.  Each day&#39;s forecast info is an element of the &quot;list&quot; array.</span></td>
      </tr>
      <tr>
        <td id="L163" class="blob-num js-line-number" data-line-number="163"></td>
        <td id="LC163" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_LIST</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>list<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L164" class="blob-num js-line-number" data-line-number="164"></td>
        <td id="LC164" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L165" class="blob-num js-line-number" data-line-number="165"></td>
        <td id="LC165" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_PRESSURE</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>pressure<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L166" class="blob-num js-line-number" data-line-number="166"></td>
        <td id="LC166" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_HUMIDITY</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>humidity<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L167" class="blob-num js-line-number" data-line-number="167"></td>
        <td id="LC167" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_WINDSPEED</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>speed<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L168" class="blob-num js-line-number" data-line-number="168"></td>
        <td id="LC168" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_WIND_DIRECTION</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>deg<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L169" class="blob-num js-line-number" data-line-number="169"></td>
        <td id="LC169" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L170" class="blob-num js-line-number" data-line-number="170"></td>
        <td id="LC170" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// All temperatures are children of the &quot;temp&quot; object.</span></td>
      </tr>
      <tr>
        <td id="L171" class="blob-num js-line-number" data-line-number="171"></td>
        <td id="LC171" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_TEMPERATURE</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>temp<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L172" class="blob-num js-line-number" data-line-number="172"></td>
        <td id="LC172" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_MAX</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>max<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L173" class="blob-num js-line-number" data-line-number="173"></td>
        <td id="LC173" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_MIN</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>min<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L174" class="blob-num js-line-number" data-line-number="174"></td>
        <td id="LC174" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L175" class="blob-num js-line-number" data-line-number="175"></td>
        <td id="LC175" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_WEATHER</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>weather<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L176" class="blob-num js-line-number" data-line-number="176"></td>
        <td id="LC176" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_DESCRIPTION</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>main<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L177" class="blob-num js-line-number" data-line-number="177"></td>
        <td id="LC177" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">OWM_WEATHER_ID</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>id<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L178" class="blob-num js-line-number" data-line-number="178"></td>
        <td id="LC178" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L179" class="blob-num js-line-number" data-line-number="179"></td>
        <td id="LC179" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">try</span> {</td>
      </tr>
      <tr>
        <td id="L180" class="blob-num js-line-number" data-line-number="180"></td>
        <td id="LC180" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">JSONObject</span> forecastJson <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">JSONObject</span>(forecastJsonStr);</td>
      </tr>
      <tr>
        <td id="L181" class="blob-num js-line-number" data-line-number="181"></td>
        <td id="LC181" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">JSONArray</span> weatherArray <span class="pl-k">=</span> forecastJson<span class="pl-k">.</span>getJSONArray(<span class="pl-c1">OWM_LIST</span>);</td>
      </tr>
      <tr>
        <td id="L182" class="blob-num js-line-number" data-line-number="182"></td>
        <td id="LC182" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L183" class="blob-num js-line-number" data-line-number="183"></td>
        <td id="LC183" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">JSONObject</span> cityJson <span class="pl-k">=</span> forecastJson<span class="pl-k">.</span>getJSONObject(<span class="pl-c1">OWM_CITY</span>);</td>
      </tr>
      <tr>
        <td id="L184" class="blob-num js-line-number" data-line-number="184"></td>
        <td id="LC184" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">String</span> cityName <span class="pl-k">=</span> cityJson<span class="pl-k">.</span>getString(<span class="pl-c1">OWM_CITY_NAME</span>);</td>
      </tr>
      <tr>
        <td id="L185" class="blob-num js-line-number" data-line-number="185"></td>
        <td id="LC185" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L186" class="blob-num js-line-number" data-line-number="186"></td>
        <td id="LC186" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">JSONObject</span> cityCoord <span class="pl-k">=</span> cityJson<span class="pl-k">.</span>getJSONObject(<span class="pl-c1">OWM_COORD</span>);</td>
      </tr>
      <tr>
        <td id="L187" class="blob-num js-line-number" data-line-number="187"></td>
        <td id="LC187" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">double</span> cityLatitude <span class="pl-k">=</span> cityCoord<span class="pl-k">.</span>getDouble(<span class="pl-c1">OWM_LATITUDE</span>);</td>
      </tr>
      <tr>
        <td id="L188" class="blob-num js-line-number" data-line-number="188"></td>
        <td id="LC188" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">double</span> cityLongitude <span class="pl-k">=</span> cityCoord<span class="pl-k">.</span>getDouble(<span class="pl-c1">OWM_LONGITUDE</span>);</td>
      </tr>
      <tr>
        <td id="L189" class="blob-num js-line-number" data-line-number="189"></td>
        <td id="LC189" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L190" class="blob-num js-line-number" data-line-number="190"></td>
        <td id="LC190" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">long</span> locationId <span class="pl-k">=</span> addLocation(locationSetting, cityName, cityLatitude, cityLongitude);</td>
      </tr>
      <tr>
        <td id="L191" class="blob-num js-line-number" data-line-number="191"></td>
        <td id="LC191" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L192" class="blob-num js-line-number" data-line-number="192"></td>
        <td id="LC192" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// Insert the new weather information into the database</span></td>
      </tr>
      <tr>
        <td id="L193" class="blob-num js-line-number" data-line-number="193"></td>
        <td id="LC193" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">Vector&lt;<span class="pl-smi">ContentValues</span>&gt;</span> cVVector <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-k">Vector&lt;<span class="pl-smi">ContentValues</span>&gt;</span>(weatherArray<span class="pl-k">.</span>length());</td>
      </tr>
      <tr>
        <td id="L194" class="blob-num js-line-number" data-line-number="194"></td>
        <td id="LC194" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L195" class="blob-num js-line-number" data-line-number="195"></td>
        <td id="LC195" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// OWM returns daily forecasts based upon the local time of the city that is being</span></td>
      </tr>
      <tr>
        <td id="L196" class="blob-num js-line-number" data-line-number="196"></td>
        <td id="LC196" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// asked for, which means that we need to know the GMT offset to translate this data</span></td>
      </tr>
      <tr>
        <td id="L197" class="blob-num js-line-number" data-line-number="197"></td>
        <td id="LC197" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// properly.</span></td>
      </tr>
      <tr>
        <td id="L198" class="blob-num js-line-number" data-line-number="198"></td>
        <td id="LC198" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L199" class="blob-num js-line-number" data-line-number="199"></td>
        <td id="LC199" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// Since this data is also sent in-order and the first day is always the</span></td>
      </tr>
      <tr>
        <td id="L200" class="blob-num js-line-number" data-line-number="200"></td>
        <td id="LC200" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// current day, we&#39;re going to take advantage of that to get a nice</span></td>
      </tr>
      <tr>
        <td id="L201" class="blob-num js-line-number" data-line-number="201"></td>
        <td id="LC201" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// normalized UTC date for all of our weather.</span></td>
      </tr>
      <tr>
        <td id="L202" class="blob-num js-line-number" data-line-number="202"></td>
        <td id="LC202" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L203" class="blob-num js-line-number" data-line-number="203"></td>
        <td id="LC203" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">Time</span> dayTime <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Time</span>();</td>
      </tr>
      <tr>
        <td id="L204" class="blob-num js-line-number" data-line-number="204"></td>
        <td id="LC204" class="blob-code blob-code-inner js-file-line">            dayTime<span class="pl-k">.</span>setToNow();</td>
      </tr>
      <tr>
        <td id="L205" class="blob-num js-line-number" data-line-number="205"></td>
        <td id="LC205" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L206" class="blob-num js-line-number" data-line-number="206"></td>
        <td id="LC206" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// we start at the day returned by local time. Otherwise this is a mess.</span></td>
      </tr>
      <tr>
        <td id="L207" class="blob-num js-line-number" data-line-number="207"></td>
        <td id="LC207" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">int</span> julianStartDay <span class="pl-k">=</span> <span class="pl-smi">Time</span><span class="pl-k">.</span>getJulianDay(<span class="pl-smi">System</span><span class="pl-k">.</span>currentTimeMillis(), dayTime<span class="pl-k">.</span>gmtoff);</td>
      </tr>
      <tr>
        <td id="L208" class="blob-num js-line-number" data-line-number="208"></td>
        <td id="LC208" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L209" class="blob-num js-line-number" data-line-number="209"></td>
        <td id="LC209" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// now we work exclusively in UTC</span></td>
      </tr>
      <tr>
        <td id="L210" class="blob-num js-line-number" data-line-number="210"></td>
        <td id="LC210" class="blob-code blob-code-inner js-file-line">            dayTime <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">Time</span>();</td>
      </tr>
      <tr>
        <td id="L211" class="blob-num js-line-number" data-line-number="211"></td>
        <td id="LC211" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L212" class="blob-num js-line-number" data-line-number="212"></td>
        <td id="LC212" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span>(<span class="pl-k">int</span> i <span class="pl-k">=</span> <span class="pl-c1">0</span>; i <span class="pl-k">&lt;</span> weatherArray<span class="pl-k">.</span>length(); i<span class="pl-k">++</span>) {</td>
      </tr>
      <tr>
        <td id="L213" class="blob-num js-line-number" data-line-number="213"></td>
        <td id="LC213" class="blob-code blob-code-inner js-file-line">                <span class="pl-c">// These are the values that will be collected.</span></td>
      </tr>
      <tr>
        <td id="L214" class="blob-num js-line-number" data-line-number="214"></td>
        <td id="LC214" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">long</span> dateTime;</td>
      </tr>
      <tr>
        <td id="L215" class="blob-num js-line-number" data-line-number="215"></td>
        <td id="LC215" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">double</span> pressure;</td>
      </tr>
      <tr>
        <td id="L216" class="blob-num js-line-number" data-line-number="216"></td>
        <td id="LC216" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> humidity;</td>
      </tr>
      <tr>
        <td id="L217" class="blob-num js-line-number" data-line-number="217"></td>
        <td id="LC217" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">double</span> windSpeed;</td>
      </tr>
      <tr>
        <td id="L218" class="blob-num js-line-number" data-line-number="218"></td>
        <td id="LC218" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">double</span> windDirection;</td>
      </tr>
      <tr>
        <td id="L219" class="blob-num js-line-number" data-line-number="219"></td>
        <td id="LC219" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L220" class="blob-num js-line-number" data-line-number="220"></td>
        <td id="LC220" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">double</span> high;</td>
      </tr>
      <tr>
        <td id="L221" class="blob-num js-line-number" data-line-number="221"></td>
        <td id="LC221" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">double</span> low;</td>
      </tr>
      <tr>
        <td id="L222" class="blob-num js-line-number" data-line-number="222"></td>
        <td id="LC222" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L223" class="blob-num js-line-number" data-line-number="223"></td>
        <td id="LC223" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">String</span> description;</td>
      </tr>
      <tr>
        <td id="L224" class="blob-num js-line-number" data-line-number="224"></td>
        <td id="LC224" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">int</span> weatherId;</td>
      </tr>
      <tr>
        <td id="L225" class="blob-num js-line-number" data-line-number="225"></td>
        <td id="LC225" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L226" class="blob-num js-line-number" data-line-number="226"></td>
        <td id="LC226" class="blob-code blob-code-inner js-file-line">                <span class="pl-c">// Get the JSON object representing the day</span></td>
      </tr>
      <tr>
        <td id="L227" class="blob-num js-line-number" data-line-number="227"></td>
        <td id="LC227" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">JSONObject</span> dayForecast <span class="pl-k">=</span> weatherArray<span class="pl-k">.</span>getJSONObject(i);</td>
      </tr>
      <tr>
        <td id="L228" class="blob-num js-line-number" data-line-number="228"></td>
        <td id="LC228" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L229" class="blob-num js-line-number" data-line-number="229"></td>
        <td id="LC229" class="blob-code blob-code-inner js-file-line">                <span class="pl-c">// Cheating to convert this to UTC time, which is what we want anyhow</span></td>
      </tr>
      <tr>
        <td id="L230" class="blob-num js-line-number" data-line-number="230"></td>
        <td id="LC230" class="blob-code blob-code-inner js-file-line">                dateTime <span class="pl-k">=</span> dayTime<span class="pl-k">.</span>setJulianDay(julianStartDay<span class="pl-k">+</span>i);</td>
      </tr>
      <tr>
        <td id="L231" class="blob-num js-line-number" data-line-number="231"></td>
        <td id="LC231" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L232" class="blob-num js-line-number" data-line-number="232"></td>
        <td id="LC232" class="blob-code blob-code-inner js-file-line">                pressure <span class="pl-k">=</span> dayForecast<span class="pl-k">.</span>getDouble(<span class="pl-c1">OWM_PRESSURE</span>);</td>
      </tr>
      <tr>
        <td id="L233" class="blob-num js-line-number" data-line-number="233"></td>
        <td id="LC233" class="blob-code blob-code-inner js-file-line">                humidity <span class="pl-k">=</span> dayForecast<span class="pl-k">.</span>getInt(<span class="pl-c1">OWM_HUMIDITY</span>);</td>
      </tr>
      <tr>
        <td id="L234" class="blob-num js-line-number" data-line-number="234"></td>
        <td id="LC234" class="blob-code blob-code-inner js-file-line">                windSpeed <span class="pl-k">=</span> dayForecast<span class="pl-k">.</span>getDouble(<span class="pl-c1">OWM_WINDSPEED</span>);</td>
      </tr>
      <tr>
        <td id="L235" class="blob-num js-line-number" data-line-number="235"></td>
        <td id="LC235" class="blob-code blob-code-inner js-file-line">                windDirection <span class="pl-k">=</span> dayForecast<span class="pl-k">.</span>getDouble(<span class="pl-c1">OWM_WIND_DIRECTION</span>);</td>
      </tr>
      <tr>
        <td id="L236" class="blob-num js-line-number" data-line-number="236"></td>
        <td id="LC236" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L237" class="blob-num js-line-number" data-line-number="237"></td>
        <td id="LC237" class="blob-code blob-code-inner js-file-line">                <span class="pl-c">// Description is in a child array called &quot;weather&quot;, which is 1 element long.</span></td>
      </tr>
      <tr>
        <td id="L238" class="blob-num js-line-number" data-line-number="238"></td>
        <td id="LC238" class="blob-code blob-code-inner js-file-line">                <span class="pl-c">// That element also contains a weather code.</span></td>
      </tr>
      <tr>
        <td id="L239" class="blob-num js-line-number" data-line-number="239"></td>
        <td id="LC239" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">JSONObject</span> weatherObject <span class="pl-k">=</span></td>
      </tr>
      <tr>
        <td id="L240" class="blob-num js-line-number" data-line-number="240"></td>
        <td id="LC240" class="blob-code blob-code-inner js-file-line">                        dayForecast<span class="pl-k">.</span>getJSONArray(<span class="pl-c1">OWM_WEATHER</span>)<span class="pl-k">.</span>getJSONObject(<span class="pl-c1">0</span>);</td>
      </tr>
      <tr>
        <td id="L241" class="blob-num js-line-number" data-line-number="241"></td>
        <td id="LC241" class="blob-code blob-code-inner js-file-line">                description <span class="pl-k">=</span> weatherObject<span class="pl-k">.</span>getString(<span class="pl-c1">OWM_DESCRIPTION</span>);</td>
      </tr>
      <tr>
        <td id="L242" class="blob-num js-line-number" data-line-number="242"></td>
        <td id="LC242" class="blob-code blob-code-inner js-file-line">                weatherId <span class="pl-k">=</span> weatherObject<span class="pl-k">.</span>getInt(<span class="pl-c1">OWM_WEATHER_ID</span>);</td>
      </tr>
      <tr>
        <td id="L243" class="blob-num js-line-number" data-line-number="243"></td>
        <td id="LC243" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L244" class="blob-num js-line-number" data-line-number="244"></td>
        <td id="LC244" class="blob-code blob-code-inner js-file-line">                <span class="pl-c">// Temperatures are in a child object called &quot;temp&quot;.  Try not to name variables</span></td>
      </tr>
      <tr>
        <td id="L245" class="blob-num js-line-number" data-line-number="245"></td>
        <td id="LC245" class="blob-code blob-code-inner js-file-line">                <span class="pl-c">// &quot;temp&quot; when working with temperature.  It confuses everybody.</span></td>
      </tr>
      <tr>
        <td id="L246" class="blob-num js-line-number" data-line-number="246"></td>
        <td id="LC246" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">JSONObject</span> temperatureObject <span class="pl-k">=</span> dayForecast<span class="pl-k">.</span>getJSONObject(<span class="pl-c1">OWM_TEMPERATURE</span>);</td>
      </tr>
      <tr>
        <td id="L247" class="blob-num js-line-number" data-line-number="247"></td>
        <td id="LC247" class="blob-code blob-code-inner js-file-line">                high <span class="pl-k">=</span> temperatureObject<span class="pl-k">.</span>getDouble(<span class="pl-c1">OWM_MAX</span>);</td>
      </tr>
      <tr>
        <td id="L248" class="blob-num js-line-number" data-line-number="248"></td>
        <td id="LC248" class="blob-code blob-code-inner js-file-line">                low <span class="pl-k">=</span> temperatureObject<span class="pl-k">.</span>getDouble(<span class="pl-c1">OWM_MIN</span>);</td>
      </tr>
      <tr>
        <td id="L249" class="blob-num js-line-number" data-line-number="249"></td>
        <td id="LC249" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L250" class="blob-num js-line-number" data-line-number="250"></td>
        <td id="LC250" class="blob-code blob-code-inner js-file-line">                <span class="pl-smi">ContentValues</span> weatherValues <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">ContentValues</span>();</td>
      </tr>
      <tr>
        <td id="L251" class="blob-num js-line-number" data-line-number="251"></td>
        <td id="LC251" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L252" class="blob-num js-line-number" data-line-number="252"></td>
        <td id="LC252" class="blob-code blob-code-inner js-file-line">                weatherValues<span class="pl-k">.</span>put(<span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>COLUMN_LOC_KEY</span>, locationId);</td>
      </tr>
      <tr>
        <td id="L253" class="blob-num js-line-number" data-line-number="253"></td>
        <td id="LC253" class="blob-code blob-code-inner js-file-line">                weatherValues<span class="pl-k">.</span>put(<span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>COLUMN_DATE</span>, dateTime);</td>
      </tr>
      <tr>
        <td id="L254" class="blob-num js-line-number" data-line-number="254"></td>
        <td id="LC254" class="blob-code blob-code-inner js-file-line">                weatherValues<span class="pl-k">.</span>put(<span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>COLUMN_HUMIDITY</span>, humidity);</td>
      </tr>
      <tr>
        <td id="L255" class="blob-num js-line-number" data-line-number="255"></td>
        <td id="LC255" class="blob-code blob-code-inner js-file-line">                weatherValues<span class="pl-k">.</span>put(<span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>COLUMN_PRESSURE</span>, pressure);</td>
      </tr>
      <tr>
        <td id="L256" class="blob-num js-line-number" data-line-number="256"></td>
        <td id="LC256" class="blob-code blob-code-inner js-file-line">                weatherValues<span class="pl-k">.</span>put(<span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>COLUMN_WIND_SPEED</span>, windSpeed);</td>
      </tr>
      <tr>
        <td id="L257" class="blob-num js-line-number" data-line-number="257"></td>
        <td id="LC257" class="blob-code blob-code-inner js-file-line">                weatherValues<span class="pl-k">.</span>put(<span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>COLUMN_DEGREES</span>, windDirection);</td>
      </tr>
      <tr>
        <td id="L258" class="blob-num js-line-number" data-line-number="258"></td>
        <td id="LC258" class="blob-code blob-code-inner js-file-line">                weatherValues<span class="pl-k">.</span>put(<span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>COLUMN_MAX_TEMP</span>, high);</td>
      </tr>
      <tr>
        <td id="L259" class="blob-num js-line-number" data-line-number="259"></td>
        <td id="LC259" class="blob-code blob-code-inner js-file-line">                weatherValues<span class="pl-k">.</span>put(<span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>COLUMN_MIN_TEMP</span>, low);</td>
      </tr>
      <tr>
        <td id="L260" class="blob-num js-line-number" data-line-number="260"></td>
        <td id="LC260" class="blob-code blob-code-inner js-file-line">                weatherValues<span class="pl-k">.</span>put(<span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>COLUMN_SHORT_DESC</span>, description);</td>
      </tr>
      <tr>
        <td id="L261" class="blob-num js-line-number" data-line-number="261"></td>
        <td id="LC261" class="blob-code blob-code-inner js-file-line">                weatherValues<span class="pl-k">.</span>put(<span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>COLUMN_WEATHER_ID</span>, weatherId);</td>
      </tr>
      <tr>
        <td id="L262" class="blob-num js-line-number" data-line-number="262"></td>
        <td id="LC262" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L263" class="blob-num js-line-number" data-line-number="263"></td>
        <td id="LC263" class="blob-code blob-code-inner js-file-line">                cVVector<span class="pl-k">.</span>add(weatherValues);</td>
      </tr>
      <tr>
        <td id="L264" class="blob-num js-line-number" data-line-number="264"></td>
        <td id="LC264" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L265" class="blob-num js-line-number" data-line-number="265"></td>
        <td id="LC265" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L266" class="blob-num js-line-number" data-line-number="266"></td>
        <td id="LC266" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// add to database</span></td>
      </tr>
      <tr>
        <td id="L267" class="blob-num js-line-number" data-line-number="267"></td>
        <td id="LC267" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span> ( cVVector<span class="pl-k">.</span>size() <span class="pl-k">&gt;</span> <span class="pl-c1">0</span> ) {</td>
      </tr>
      <tr>
        <td id="L268" class="blob-num js-line-number" data-line-number="268"></td>
        <td id="LC268" class="blob-code blob-code-inner js-file-line">                <span class="pl-c">// Student: call bulkInsert to add the weatherEntries to the database here</span></td>
      </tr>
      <tr>
        <td id="L269" class="blob-num js-line-number" data-line-number="269"></td>
        <td id="LC269" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L270" class="blob-num js-line-number" data-line-number="270"></td>
        <td id="LC270" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L271" class="blob-num js-line-number" data-line-number="271"></td>
        <td id="LC271" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// Sort order:  Ascending, by date.</span></td>
      </tr>
      <tr>
        <td id="L272" class="blob-num js-line-number" data-line-number="272"></td>
        <td id="LC272" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">String</span> sortOrder <span class="pl-k">=</span> <span class="pl-smi">WeatherEntry</span><span class="pl-c1"><span class="pl-k">.</span>COLUMN_DATE</span> <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span> ASC<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L273" class="blob-num js-line-number" data-line-number="273"></td>
        <td id="LC273" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">Uri</span> weatherForLocationUri <span class="pl-k">=</span> <span class="pl-smi">WeatherEntry</span><span class="pl-k">.</span>buildWeatherLocationWithStartDate(</td>
      </tr>
      <tr>
        <td id="L274" class="blob-num js-line-number" data-line-number="274"></td>
        <td id="LC274" class="blob-code blob-code-inner js-file-line">                    locationSetting, <span class="pl-smi">System</span><span class="pl-k">.</span>currentTimeMillis());</td>
      </tr>
      <tr>
        <td id="L275" class="blob-num js-line-number" data-line-number="275"></td>
        <td id="LC275" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L276" class="blob-num js-line-number" data-line-number="276"></td>
        <td id="LC276" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// Students: Uncomment the next lines to display what what you stored in the bulkInsert</span></td>
      </tr>
      <tr>
        <td id="L277" class="blob-num js-line-number" data-line-number="277"></td>
        <td id="LC277" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L278" class="blob-num js-line-number" data-line-number="278"></td>
        <td id="LC278" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//            Cursor cur = mContext.getContentResolver().query(weatherForLocationUri,</span></td>
      </tr>
      <tr>
        <td id="L279" class="blob-num js-line-number" data-line-number="279"></td>
        <td id="LC279" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                    null, null, null, sortOrder);</span></td>
      </tr>
      <tr>
        <td id="L280" class="blob-num js-line-number" data-line-number="280"></td>
        <td id="LC280" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//</span></td>
      </tr>
      <tr>
        <td id="L281" class="blob-num js-line-number" data-line-number="281"></td>
        <td id="LC281" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//            cVVector = new Vector&lt;ContentValues&gt;(cur.getCount());</span></td>
      </tr>
      <tr>
        <td id="L282" class="blob-num js-line-number" data-line-number="282"></td>
        <td id="LC282" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//            if ( cur.moveToFirst() ) {</span></td>
      </tr>
      <tr>
        <td id="L283" class="blob-num js-line-number" data-line-number="283"></td>
        <td id="LC283" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                do {</span></td>
      </tr>
      <tr>
        <td id="L284" class="blob-num js-line-number" data-line-number="284"></td>
        <td id="LC284" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                    ContentValues cv = new ContentValues();</span></td>
      </tr>
      <tr>
        <td id="L285" class="blob-num js-line-number" data-line-number="285"></td>
        <td id="LC285" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                    DatabaseUtils.cursorRowToContentValues(cur, cv);</span></td>
      </tr>
      <tr>
        <td id="L286" class="blob-num js-line-number" data-line-number="286"></td>
        <td id="LC286" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                    cVVector.add(cv);</span></td>
      </tr>
      <tr>
        <td id="L287" class="blob-num js-line-number" data-line-number="287"></td>
        <td id="LC287" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                } while (cur.moveToNext());</span></td>
      </tr>
      <tr>
        <td id="L288" class="blob-num js-line-number" data-line-number="288"></td>
        <td id="LC288" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//            }</span></td>
      </tr>
      <tr>
        <td id="L289" class="blob-num js-line-number" data-line-number="289"></td>
        <td id="LC289" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L290" class="blob-num js-line-number" data-line-number="290"></td>
        <td id="LC290" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">Log</span><span class="pl-k">.</span>d(<span class="pl-c1">LOG_TAG</span>, <span class="pl-s"><span class="pl-pds">&quot;</span>FetchWeatherTask Complete. <span class="pl-pds">&quot;</span></span> <span class="pl-k">+</span> cVVector<span class="pl-k">.</span>size() <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span> Inserted<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L291" class="blob-num js-line-number" data-line-number="291"></td>
        <td id="LC291" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L292" class="blob-num js-line-number" data-line-number="292"></td>
        <td id="LC292" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">String</span>[] resultStrs <span class="pl-k">=</span> convertContentValuesToUXFormat(cVVector);</td>
      </tr>
      <tr>
        <td id="L293" class="blob-num js-line-number" data-line-number="293"></td>
        <td id="LC293" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">return</span> resultStrs;</td>
      </tr>
      <tr>
        <td id="L294" class="blob-num js-line-number" data-line-number="294"></td>
        <td id="LC294" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L295" class="blob-num js-line-number" data-line-number="295"></td>
        <td id="LC295" class="blob-code blob-code-inner js-file-line">        } <span class="pl-k">catch</span> (<span class="pl-smi">JSONException</span> e) {</td>
      </tr>
      <tr>
        <td id="L296" class="blob-num js-line-number" data-line-number="296"></td>
        <td id="LC296" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">Log</span><span class="pl-k">.</span>e(<span class="pl-c1">LOG_TAG</span>, e<span class="pl-k">.</span>getMessage(), e);</td>
      </tr>
      <tr>
        <td id="L297" class="blob-num js-line-number" data-line-number="297"></td>
        <td id="LC297" class="blob-code blob-code-inner js-file-line">            e<span class="pl-k">.</span>printStackTrace();</td>
      </tr>
      <tr>
        <td id="L298" class="blob-num js-line-number" data-line-number="298"></td>
        <td id="LC298" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L299" class="blob-num js-line-number" data-line-number="299"></td>
        <td id="LC299" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">return</span> <span class="pl-c1">null</span>;</td>
      </tr>
      <tr>
        <td id="L300" class="blob-num js-line-number" data-line-number="300"></td>
        <td id="LC300" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L301" class="blob-num js-line-number" data-line-number="301"></td>
        <td id="LC301" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L302" class="blob-num js-line-number" data-line-number="302"></td>
        <td id="LC302" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">@Override</span></td>
      </tr>
      <tr>
        <td id="L303" class="blob-num js-line-number" data-line-number="303"></td>
        <td id="LC303" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">protected</span> <span class="pl-k">String</span>[] <span class="pl-en">doInBackground</span>(<span class="pl-smi">String</span>... <span class="pl-v">params</span>) {</td>
      </tr>
      <tr>
        <td id="L304" class="blob-num js-line-number" data-line-number="304"></td>
        <td id="LC304" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L305" class="blob-num js-line-number" data-line-number="305"></td>
        <td id="LC305" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// If there&#39;s no zip code, there&#39;s nothing to look up.  Verify size of params.</span></td>
      </tr>
      <tr>
        <td id="L306" class="blob-num js-line-number" data-line-number="306"></td>
        <td id="LC306" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span> (params<span class="pl-k">.</span>length <span class="pl-k">==</span> <span class="pl-c1">0</span>) {</td>
      </tr>
      <tr>
        <td id="L307" class="blob-num js-line-number" data-line-number="307"></td>
        <td id="LC307" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">return</span> <span class="pl-c1">null</span>;</td>
      </tr>
      <tr>
        <td id="L308" class="blob-num js-line-number" data-line-number="308"></td>
        <td id="LC308" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L309" class="blob-num js-line-number" data-line-number="309"></td>
        <td id="LC309" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">String</span> locationQuery <span class="pl-k">=</span> params[<span class="pl-c1">0</span>];</td>
      </tr>
      <tr>
        <td id="L310" class="blob-num js-line-number" data-line-number="310"></td>
        <td id="LC310" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L311" class="blob-num js-line-number" data-line-number="311"></td>
        <td id="LC311" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// These two need to be declared outside the try/catch</span></td>
      </tr>
      <tr>
        <td id="L312" class="blob-num js-line-number" data-line-number="312"></td>
        <td id="LC312" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// so that they can be closed in the finally block.</span></td>
      </tr>
      <tr>
        <td id="L313" class="blob-num js-line-number" data-line-number="313"></td>
        <td id="LC313" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">HttpURLConnection</span> urlConnection <span class="pl-k">=</span> <span class="pl-c1">null</span>;</td>
      </tr>
      <tr>
        <td id="L314" class="blob-num js-line-number" data-line-number="314"></td>
        <td id="LC314" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">BufferedReader</span> reader <span class="pl-k">=</span> <span class="pl-c1">null</span>;</td>
      </tr>
      <tr>
        <td id="L315" class="blob-num js-line-number" data-line-number="315"></td>
        <td id="LC315" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L316" class="blob-num js-line-number" data-line-number="316"></td>
        <td id="LC316" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// Will contain the raw JSON response as a string.</span></td>
      </tr>
      <tr>
        <td id="L317" class="blob-num js-line-number" data-line-number="317"></td>
        <td id="LC317" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">String</span> forecastJsonStr <span class="pl-k">=</span> <span class="pl-c1">null</span>;</td>
      </tr>
      <tr>
        <td id="L318" class="blob-num js-line-number" data-line-number="318"></td>
        <td id="LC318" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L319" class="blob-num js-line-number" data-line-number="319"></td>
        <td id="LC319" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">String</span> format <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>json<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L320" class="blob-num js-line-number" data-line-number="320"></td>
        <td id="LC320" class="blob-code blob-code-inner js-file-line">        <span class="pl-smi">String</span> units <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>metric<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L321" class="blob-num js-line-number" data-line-number="321"></td>
        <td id="LC321" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">int</span> numDays <span class="pl-k">=</span> <span class="pl-c1">14</span>;</td>
      </tr>
      <tr>
        <td id="L322" class="blob-num js-line-number" data-line-number="322"></td>
        <td id="LC322" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L323" class="blob-num js-line-number" data-line-number="323"></td>
        <td id="LC323" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">try</span> {</td>
      </tr>
      <tr>
        <td id="L324" class="blob-num js-line-number" data-line-number="324"></td>
        <td id="LC324" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// Construct the URL for the OpenWeatherMap query</span></td>
      </tr>
      <tr>
        <td id="L325" class="blob-num js-line-number" data-line-number="325"></td>
        <td id="LC325" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// Possible parameters are avaiable at OWM&#39;s forecast API page, at</span></td>
      </tr>
      <tr>
        <td id="L326" class="blob-num js-line-number" data-line-number="326"></td>
        <td id="LC326" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// http://openweathermap.org/API#forecast</span></td>
      </tr>
      <tr>
        <td id="L327" class="blob-num js-line-number" data-line-number="327"></td>
        <td id="LC327" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">FORECAST_BASE_URL</span> <span class="pl-k">=</span></td>
      </tr>
      <tr>
        <td id="L328" class="blob-num js-line-number" data-line-number="328"></td>
        <td id="LC328" class="blob-code blob-code-inner js-file-line">                    <span class="pl-s"><span class="pl-pds">&quot;</span>http://api.openweathermap.org/data/2.5/forecast/daily?<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L329" class="blob-num js-line-number" data-line-number="329"></td>
        <td id="LC329" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">QUERY_PARAM</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>q<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L330" class="blob-num js-line-number" data-line-number="330"></td>
        <td id="LC330" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">FORMAT_PARAM</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>mode<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L331" class="blob-num js-line-number" data-line-number="331"></td>
        <td id="LC331" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">UNITS_PARAM</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>units<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L332" class="blob-num js-line-number" data-line-number="332"></td>
        <td id="LC332" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">DAYS_PARAM</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>cnt<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L333" class="blob-num js-line-number" data-line-number="333"></td>
        <td id="LC333" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L334" class="blob-num js-line-number" data-line-number="334"></td>
        <td id="LC334" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">Uri</span> builtUri <span class="pl-k">=</span> <span class="pl-smi">Uri</span><span class="pl-k">.</span>parse(<span class="pl-c1">FORECAST_BASE_URL</span>)<span class="pl-k">.</span>buildUpon()</td>
      </tr>
      <tr>
        <td id="L335" class="blob-num js-line-number" data-line-number="335"></td>
        <td id="LC335" class="blob-code blob-code-inner js-file-line">                    .appendQueryParameter(<span class="pl-c1">QUERY_PARAM</span>, params[<span class="pl-c1">0</span>])</td>
      </tr>
      <tr>
        <td id="L336" class="blob-num js-line-number" data-line-number="336"></td>
        <td id="LC336" class="blob-code blob-code-inner js-file-line">                    .appendQueryParameter(<span class="pl-c1">FORMAT_PARAM</span>, format)</td>
      </tr>
      <tr>
        <td id="L337" class="blob-num js-line-number" data-line-number="337"></td>
        <td id="LC337" class="blob-code blob-code-inner js-file-line">                    .appendQueryParameter(<span class="pl-c1">UNITS_PARAM</span>, units)</td>
      </tr>
      <tr>
        <td id="L338" class="blob-num js-line-number" data-line-number="338"></td>
        <td id="LC338" class="blob-code blob-code-inner js-file-line">                    .appendQueryParameter(<span class="pl-c1">DAYS_PARAM</span>, <span class="pl-smi">Integer</span><span class="pl-k">.</span>toString(numDays))</td>
      </tr>
      <tr>
        <td id="L339" class="blob-num js-line-number" data-line-number="339"></td>
        <td id="LC339" class="blob-code blob-code-inner js-file-line">                    .build();</td>
      </tr>
      <tr>
        <td id="L340" class="blob-num js-line-number" data-line-number="340"></td>
        <td id="LC340" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L341" class="blob-num js-line-number" data-line-number="341"></td>
        <td id="LC341" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">URL</span> url <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">URL</span>(builtUri<span class="pl-k">.</span>toString());</td>
      </tr>
      <tr>
        <td id="L342" class="blob-num js-line-number" data-line-number="342"></td>
        <td id="LC342" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L343" class="blob-num js-line-number" data-line-number="343"></td>
        <td id="LC343" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// Create the request to OpenWeatherMap, and open the connection</span></td>
      </tr>
      <tr>
        <td id="L344" class="blob-num js-line-number" data-line-number="344"></td>
        <td id="LC344" class="blob-code blob-code-inner js-file-line">            urlConnection <span class="pl-k">=</span> (<span class="pl-smi">HttpURLConnection</span>) url<span class="pl-k">.</span>openConnection();</td>
      </tr>
      <tr>
        <td id="L345" class="blob-num js-line-number" data-line-number="345"></td>
        <td id="LC345" class="blob-code blob-code-inner js-file-line">            urlConnection<span class="pl-k">.</span>setRequestMethod(<span class="pl-s"><span class="pl-pds">&quot;</span>GET<span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L346" class="blob-num js-line-number" data-line-number="346"></td>
        <td id="LC346" class="blob-code blob-code-inner js-file-line">            urlConnection<span class="pl-k">.</span>connect();</td>
      </tr>
      <tr>
        <td id="L347" class="blob-num js-line-number" data-line-number="347"></td>
        <td id="LC347" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L348" class="blob-num js-line-number" data-line-number="348"></td>
        <td id="LC348" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// Read the input stream into a String</span></td>
      </tr>
      <tr>
        <td id="L349" class="blob-num js-line-number" data-line-number="349"></td>
        <td id="LC349" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">InputStream</span> inputStream <span class="pl-k">=</span> urlConnection<span class="pl-k">.</span>getInputStream();</td>
      </tr>
      <tr>
        <td id="L350" class="blob-num js-line-number" data-line-number="350"></td>
        <td id="LC350" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">StringBuffer</span> buffer <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">StringBuffer</span>();</td>
      </tr>
      <tr>
        <td id="L351" class="blob-num js-line-number" data-line-number="351"></td>
        <td id="LC351" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span> (inputStream <span class="pl-k">==</span> <span class="pl-c1">null</span>) {</td>
      </tr>
      <tr>
        <td id="L352" class="blob-num js-line-number" data-line-number="352"></td>
        <td id="LC352" class="blob-code blob-code-inner js-file-line">                <span class="pl-c">// Nothing to do.</span></td>
      </tr>
      <tr>
        <td id="L353" class="blob-num js-line-number" data-line-number="353"></td>
        <td id="LC353" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">return</span> <span class="pl-c1">null</span>;</td>
      </tr>
      <tr>
        <td id="L354" class="blob-num js-line-number" data-line-number="354"></td>
        <td id="LC354" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L355" class="blob-num js-line-number" data-line-number="355"></td>
        <td id="LC355" class="blob-code blob-code-inner js-file-line">            reader <span class="pl-k">=</span> <span class="pl-k">new</span> <span class="pl-smi">BufferedReader</span>(<span class="pl-k">new</span> <span class="pl-smi">InputStreamReader</span>(inputStream));</td>
      </tr>
      <tr>
        <td id="L356" class="blob-num js-line-number" data-line-number="356"></td>
        <td id="LC356" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L357" class="blob-num js-line-number" data-line-number="357"></td>
        <td id="LC357" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">String</span> line;</td>
      </tr>
      <tr>
        <td id="L358" class="blob-num js-line-number" data-line-number="358"></td>
        <td id="LC358" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">while</span> ((line <span class="pl-k">=</span> reader<span class="pl-k">.</span>readLine()) <span class="pl-k">!=</span> <span class="pl-c1">null</span>) {</td>
      </tr>
      <tr>
        <td id="L359" class="blob-num js-line-number" data-line-number="359"></td>
        <td id="LC359" class="blob-code blob-code-inner js-file-line">                <span class="pl-c">// Since it&#39;s JSON, adding a newline isn&#39;t necessary (it won&#39;t affect parsing)</span></td>
      </tr>
      <tr>
        <td id="L360" class="blob-num js-line-number" data-line-number="360"></td>
        <td id="LC360" class="blob-code blob-code-inner js-file-line">                <span class="pl-c">// But it does make debugging a *lot* easier if you print out the completed</span></td>
      </tr>
      <tr>
        <td id="L361" class="blob-num js-line-number" data-line-number="361"></td>
        <td id="LC361" class="blob-code blob-code-inner js-file-line">                <span class="pl-c">// buffer for debugging.</span></td>
      </tr>
      <tr>
        <td id="L362" class="blob-num js-line-number" data-line-number="362"></td>
        <td id="LC362" class="blob-code blob-code-inner js-file-line">                buffer<span class="pl-k">.</span>append(line <span class="pl-k">+</span> <span class="pl-s"><span class="pl-pds">&quot;</span><span class="pl-cce">\n</span><span class="pl-pds">&quot;</span></span>);</td>
      </tr>
      <tr>
        <td id="L363" class="blob-num js-line-number" data-line-number="363"></td>
        <td id="LC363" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L364" class="blob-num js-line-number" data-line-number="364"></td>
        <td id="LC364" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L365" class="blob-num js-line-number" data-line-number="365"></td>
        <td id="LC365" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span> (buffer<span class="pl-k">.</span>length() <span class="pl-k">==</span> <span class="pl-c1">0</span>) {</td>
      </tr>
      <tr>
        <td id="L366" class="blob-num js-line-number" data-line-number="366"></td>
        <td id="LC366" class="blob-code blob-code-inner js-file-line">                <span class="pl-c">// Stream was empty.  No point in parsing.</span></td>
      </tr>
      <tr>
        <td id="L367" class="blob-num js-line-number" data-line-number="367"></td>
        <td id="LC367" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">return</span> <span class="pl-c1">null</span>;</td>
      </tr>
      <tr>
        <td id="L368" class="blob-num js-line-number" data-line-number="368"></td>
        <td id="LC368" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L369" class="blob-num js-line-number" data-line-number="369"></td>
        <td id="LC369" class="blob-code blob-code-inner js-file-line">            forecastJsonStr <span class="pl-k">=</span> buffer<span class="pl-k">.</span>toString();</td>
      </tr>
      <tr>
        <td id="L370" class="blob-num js-line-number" data-line-number="370"></td>
        <td id="LC370" class="blob-code blob-code-inner js-file-line">        } <span class="pl-k">catch</span> (<span class="pl-smi">IOException</span> e) {</td>
      </tr>
      <tr>
        <td id="L371" class="blob-num js-line-number" data-line-number="371"></td>
        <td id="LC371" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">Log</span><span class="pl-k">.</span>e(<span class="pl-c1">LOG_TAG</span>, <span class="pl-s"><span class="pl-pds">&quot;</span>Error <span class="pl-pds">&quot;</span></span>, e);</td>
      </tr>
      <tr>
        <td id="L372" class="blob-num js-line-number" data-line-number="372"></td>
        <td id="LC372" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// If the code didn&#39;t successfully get the weather data, there&#39;s no point in attemping</span></td>
      </tr>
      <tr>
        <td id="L373" class="blob-num js-line-number" data-line-number="373"></td>
        <td id="LC373" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// to parse it.</span></td>
      </tr>
      <tr>
        <td id="L374" class="blob-num js-line-number" data-line-number="374"></td>
        <td id="LC374" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">return</span> <span class="pl-c1">null</span>;</td>
      </tr>
      <tr>
        <td id="L375" class="blob-num js-line-number" data-line-number="375"></td>
        <td id="LC375" class="blob-code blob-code-inner js-file-line">        } <span class="pl-k">finally</span> {</td>
      </tr>
      <tr>
        <td id="L376" class="blob-num js-line-number" data-line-number="376"></td>
        <td id="LC376" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span> (urlConnection <span class="pl-k">!=</span> <span class="pl-c1">null</span>) {</td>
      </tr>
      <tr>
        <td id="L377" class="blob-num js-line-number" data-line-number="377"></td>
        <td id="LC377" class="blob-code blob-code-inner js-file-line">                urlConnection<span class="pl-k">.</span>disconnect();</td>
      </tr>
      <tr>
        <td id="L378" class="blob-num js-line-number" data-line-number="378"></td>
        <td id="LC378" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L379" class="blob-num js-line-number" data-line-number="379"></td>
        <td id="LC379" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">if</span> (reader <span class="pl-k">!=</span> <span class="pl-c1">null</span>) {</td>
      </tr>
      <tr>
        <td id="L380" class="blob-num js-line-number" data-line-number="380"></td>
        <td id="LC380" class="blob-code blob-code-inner js-file-line">                <span class="pl-k">try</span> {</td>
      </tr>
      <tr>
        <td id="L381" class="blob-num js-line-number" data-line-number="381"></td>
        <td id="LC381" class="blob-code blob-code-inner js-file-line">                    reader<span class="pl-k">.</span>close();</td>
      </tr>
      <tr>
        <td id="L382" class="blob-num js-line-number" data-line-number="382"></td>
        <td id="LC382" class="blob-code blob-code-inner js-file-line">                } <span class="pl-k">catch</span> (<span class="pl-k">final</span> <span class="pl-smi">IOException</span> e) {</td>
      </tr>
      <tr>
        <td id="L383" class="blob-num js-line-number" data-line-number="383"></td>
        <td id="LC383" class="blob-code blob-code-inner js-file-line">                    <span class="pl-smi">Log</span><span class="pl-k">.</span>e(<span class="pl-c1">LOG_TAG</span>, <span class="pl-s"><span class="pl-pds">&quot;</span>Error closing stream<span class="pl-pds">&quot;</span></span>, e);</td>
      </tr>
      <tr>
        <td id="L384" class="blob-num js-line-number" data-line-number="384"></td>
        <td id="LC384" class="blob-code blob-code-inner js-file-line">                }</td>
      </tr>
      <tr>
        <td id="L385" class="blob-num js-line-number" data-line-number="385"></td>
        <td id="LC385" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L386" class="blob-num js-line-number" data-line-number="386"></td>
        <td id="LC386" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L387" class="blob-num js-line-number" data-line-number="387"></td>
        <td id="LC387" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L388" class="blob-num js-line-number" data-line-number="388"></td>
        <td id="LC388" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">try</span> {</td>
      </tr>
      <tr>
        <td id="L389" class="blob-num js-line-number" data-line-number="389"></td>
        <td id="LC389" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">return</span> getWeatherDataFromJson(forecastJsonStr, locationQuery);</td>
      </tr>
      <tr>
        <td id="L390" class="blob-num js-line-number" data-line-number="390"></td>
        <td id="LC390" class="blob-code blob-code-inner js-file-line">        } <span class="pl-k">catch</span> (<span class="pl-smi">JSONException</span> e) {</td>
      </tr>
      <tr>
        <td id="L391" class="blob-num js-line-number" data-line-number="391"></td>
        <td id="LC391" class="blob-code blob-code-inner js-file-line">            <span class="pl-smi">Log</span><span class="pl-k">.</span>e(<span class="pl-c1">LOG_TAG</span>, e<span class="pl-k">.</span>getMessage(), e);</td>
      </tr>
      <tr>
        <td id="L392" class="blob-num js-line-number" data-line-number="392"></td>
        <td id="LC392" class="blob-code blob-code-inner js-file-line">            e<span class="pl-k">.</span>printStackTrace();</td>
      </tr>
      <tr>
        <td id="L393" class="blob-num js-line-number" data-line-number="393"></td>
        <td id="LC393" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L394" class="blob-num js-line-number" data-line-number="394"></td>
        <td id="LC394" class="blob-code blob-code-inner js-file-line">        <span class="pl-c">// This will only happen if there was an error getting or parsing the forecast.</span></td>
      </tr>
      <tr>
        <td id="L395" class="blob-num js-line-number" data-line-number="395"></td>
        <td id="LC395" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">return</span> <span class="pl-c1">null</span>;</td>
      </tr>
      <tr>
        <td id="L396" class="blob-num js-line-number" data-line-number="396"></td>
        <td id="LC396" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L397" class="blob-num js-line-number" data-line-number="397"></td>
        <td id="LC397" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L398" class="blob-num js-line-number" data-line-number="398"></td>
        <td id="LC398" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">@Override</span></td>
      </tr>
      <tr>
        <td id="L399" class="blob-num js-line-number" data-line-number="399"></td>
        <td id="LC399" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">protected</span> <span class="pl-k">void</span> <span class="pl-en">onPostExecute</span>(<span class="pl-k">String</span>[] <span class="pl-v">result</span>) {</td>
      </tr>
      <tr>
        <td id="L400" class="blob-num js-line-number" data-line-number="400"></td>
        <td id="LC400" class="blob-code blob-code-inner js-file-line">        <span class="pl-k">if</span> (result <span class="pl-k">!=</span> <span class="pl-c1">null</span> <span class="pl-k">&amp;&amp;</span> mForecastAdapter <span class="pl-k">!=</span> <span class="pl-c1">null</span>) {</td>
      </tr>
      <tr>
        <td id="L401" class="blob-num js-line-number" data-line-number="401"></td>
        <td id="LC401" class="blob-code blob-code-inner js-file-line">            mForecastAdapter<span class="pl-k">.</span>clear();</td>
      </tr>
      <tr>
        <td id="L402" class="blob-num js-line-number" data-line-number="402"></td>
        <td id="LC402" class="blob-code blob-code-inner js-file-line">            <span class="pl-k">for</span>(<span class="pl-smi">String</span> dayForecastStr <span class="pl-k">:</span> result) {</td>
      </tr>
      <tr>
        <td id="L403" class="blob-num js-line-number" data-line-number="403"></td>
        <td id="LC403" class="blob-code blob-code-inner js-file-line">                mForecastAdapter<span class="pl-k">.</span>add(dayForecastStr);</td>
      </tr>
      <tr>
        <td id="L404" class="blob-num js-line-number" data-line-number="404"></td>
        <td id="LC404" class="blob-code blob-code-inner js-file-line">            }</td>
      </tr>
      <tr>
        <td id="L405" class="blob-num js-line-number" data-line-number="405"></td>
        <td id="LC405" class="blob-code blob-code-inner js-file-line">            <span class="pl-c">// New data is back from the server.  Hooray!</span></td>
      </tr>
      <tr>
        <td id="L406" class="blob-num js-line-number" data-line-number="406"></td>
        <td id="LC406" class="blob-code blob-code-inner js-file-line">        }</td>
      </tr>
      <tr>
        <td id="L407" class="blob-num js-line-number" data-line-number="407"></td>
        <td id="LC407" class="blob-code blob-code-inner js-file-line">    }</td>
      </tr>
      <tr>
        <td id="L408" class="blob-num js-line-number" data-line-number="408"></td>
        <td id="LC408" class="blob-code blob-code-inner js-file-line">}</td>
      </tr>
</table>

  </div>

</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="" class="js-jump-to-line-form" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" aria-label="Jump to line" autofocus>
    <button type="submit" class="btn">Go</button>
</form></div>

          </div>
        </div>
        <div class="modal-backdrop"></div>
      </div>
  </div>


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer" role="contentinfo">
    <ul class="site-footer-links right">
        <li><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
      <li><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
      <li><a href="https://shop.github.com" data-ga-click="Footer, go to shop, text:shop">Shop</a></li>
        <li><a href="https://github.com/blog" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a href="https://github.com/about" data-ga-click="Footer, go to about, text:about">About</a></li>
        <li><a href="https://help.github.com" data-ga-click="Footer, go to help, text:help">Help</a></li>

    </ul>

    <a href="https://github.com" aria-label="Homepage">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
</a>
    <ul class="site-footer-links">
      <li>&copy; 2015 <span title="0.04453s from github-fe135-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="https://github.com/site/terms" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
        <li><a href="https://github.com/site/privacy" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
        <li><a href="https://github.com/security" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li><a href="https://github.com/contact" data-ga-click="Footer, go to contact, text:contact">Contact</a></li>
    </ul>
  </div>
</div>


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-suggester-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="fullscreen-contents js-fullscreen-contents" placeholder="" aria-label=""></textarea>
      <div class="suggester-container">
        <div class="suggester fullscreen-suggester js-suggester js-navigation-container"></div>
      </div>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    
    

    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-x flash-close js-ajax-error-dismiss" aria-label="Dismiss error"></a>
      Something went wrong with that request. Please try again.
    </div>


      <script crossorigin="anonymous" src="https://assets-cdn.github.com/assets/frameworks-a5550e0bb066809cdc63a2cb60405556f966a5493a91004512f8df5d524376aa.js"></script>
      <script async="async" crossorigin="anonymous" src="https://assets-cdn.github.com/assets/github/index-37dcf3694f94f84a19aa47b4cf8c7deea0666a4085b0e90f6e4212da65c4a8fb.js"></script>
      
      
  </body>
</html>

