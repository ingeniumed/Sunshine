


<!DOCTYPE html>
<html lang="en" class=" is-copy-enabled">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    <meta name="viewport" content="width=1020">
    
    
    <title>Sunshine-Version-2/TestFetchWeatherTask.java at lesson_4_content_provider_starter_code · udacity/Sunshine-Version-2 · GitHub</title>
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

    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="AE73855D:44D0:B9759DF:55C6721D" name="octolytics-dimension-request_id" />
    
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
<meta content="FtLGU1E2W8DIkrbdiXoUPK4hXhL6w8lOlepm0dySwBQF2kMrEVDC6eSHT05RTjCosd+OYW/rYeJ8A8ABMyF2fQ==" name="csrf-token" />
    

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
      <a class="btn" href="/login?return_to=%2Fudacity%2FSunshine-Version-2%2Fblob%2Flesson_4_content_provider_starter_code%2FTestFetchWeatherTask.java" data-ga-click="(Logged out) Header, clicked Sign in, text:sign-in">Sign in</a>
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
    <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone" class="inline-form js-clone-selector-form " data-form-nonce="d4914f36aaf9fd0e870364ca4914af95c521eba5" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="CSVblzrDTRG70OXrEr6VbD6DIwNrVojlqPp5gy2vAJ+7EfQEb7vClFngerqXijSt8dw/uhvOmkklPVMsm1qPUA==" /></div><button class="btn-link js-clone-selector" data-protocol="http" type="submit">HTTPS</button></form> or <!-- </textarea> --><!-- '"` --><form accept-charset="UTF-8" action="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone" class="inline-form js-clone-selector-form " data-form-nonce="d4914f36aaf9fd0e870364ca4914af95c521eba5" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="NCkG+Ee1Z0umQSsQfTq9CHXPauZHSIQ+XVquaCfPbtDTb+LGZ5lxuDobn45WljReNHfSt74828wS8KR6IPkSUw==" /></div><button class="btn-link js-clone-selector" data-protocol="subversion" type="submit">Subversion</button></form>.
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

            

<a href="/udacity/Sunshine-Version-2/blob/1578a360189e9e929004894ed3e8f2210b7db8a7/TestFetchWeatherTask.java" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:c8f04ff5c68666c61147f156ac43f3d6 -->

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
               href="/udacity/Sunshine-Version-2/blob/1.01_hello_world/TestFetchWeatherTask.java"
               data-name="1.01_hello_world"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.01_hello_world">
                1.01_hello_world
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.02_add_list_item_forecast_layout/TestFetchWeatherTask.java"
               data-name="1.02_add_list_item_forecast_layout"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.02_add_list_item_forecast_layout">
                1.02_add_list_item_forecast_layout
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.03_update_fragment_layout/TestFetchWeatherTask.java"
               data-name="1.03_update_fragment_layout"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.03_update_fragment_layout">
                1.03_update_fragment_layout
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.04_add_dummy_data/TestFetchWeatherTask.java"
               data-name="1.04_add_dummy_data"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.04_add_dummy_data">
                1.04_add_dummy_data
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.05_create_arrayadapter/TestFetchWeatherTask.java"
               data-name="1.05_create_arrayadapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.05_create_arrayadapter">
                1.05_create_arrayadapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.06_attach_adapter/TestFetchWeatherTask.java"
               data-name="1.06_attach_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.06_attach_adapter">
                1.06_attach_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.01_add_network_code/TestFetchWeatherTask.java"
               data-name="2.01_add_network_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.01_add_network_code">
                2.01_add_network_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.02_refactor_forecast_fragment/TestFetchWeatherTask.java"
               data-name="2.02_refactor_forecast_fragment"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.02_refactor_forecast_fragment">
                2.02_refactor_forecast_fragment
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.03_add_refresh_xml/TestFetchWeatherTask.java"
               data-name="2.03_add_refresh_xml"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.03_add_refresh_xml">
                2.03_add_refresh_xml
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.04_inflate_menu/TestFetchWeatherTask.java"
               data-name="2.04_inflate_menu"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.04_inflate_menu">
                2.04_inflate_menu
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.05_execute_fetchweathertask/TestFetchWeatherTask.java"
               data-name="2.05_execute_fetchweathertask"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.05_execute_fetchweathertask">
                2.05_execute_fetchweathertask
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.06_add_internet_permissions/TestFetchWeatherTask.java"
               data-name="2.06_add_internet_permissions"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.06_add_internet_permissions">
                2.06_add_internet_permissions
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.07_build_url_with_params/TestFetchWeatherTask.java"
               data-name="2.07_build_url_with_params"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.07_build_url_with_params">
                2.07_build_url_with_params
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.08_json_parsing/TestFetchWeatherTask.java"
               data-name="2.08_json_parsing"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.08_json_parsing">
                2.08_json_parsing
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.09_display_data/TestFetchWeatherTask.java"
               data-name="2.09_display_data"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.09_display_data">
                2.09_display_data
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.00_remove_logging/TestFetchWeatherTask.java"
               data-name="3.00_remove_logging"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.00_remove_logging">
                3.00_remove_logging
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.01_add_toast/TestFetchWeatherTask.java"
               data-name="3.01_add_toast"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.01_add_toast">
                3.01_add_toast
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.02_create_detail_activity/TestFetchWeatherTask.java"
               data-name="3.02_create_detail_activity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.02_create_detail_activity">
                3.02_create_detail_activity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.03_launch_detail_activity/TestFetchWeatherTask.java"
               data-name="3.03_launch_detail_activity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.03_launch_detail_activity">
                3.03_launch_detail_activity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.04_populate_detail_text/TestFetchWeatherTask.java"
               data-name="3.04_populate_detail_text"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.04_populate_detail_text">
                3.04_populate_detail_text
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.05_add_settingsactivity/TestFetchWeatherTask.java"
               data-name="3.05_add_settingsactivity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.05_add_settingsactivity">
                3.05_add_settingsactivity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.06_launch_settings/TestFetchWeatherTask.java"
               data-name="3.06_launch_settings"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.06_launch_settings">
                3.06_launch_settings
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.07_add_locations_setting/TestFetchWeatherTask.java"
               data-name="3.07_add_locations_setting"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.07_add_locations_setting">
                3.07_add_locations_setting
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.08_inflate_settingsactivity/TestFetchWeatherTask.java"
               data-name="3.08_inflate_settingsactivity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.08_inflate_settingsactivity">
                3.08_inflate_settingsactivity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.09_location_from_prefs/TestFetchWeatherTask.java"
               data-name="3.09_location_from_prefs"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.09_location_from_prefs">
                3.09_location_from_prefs
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.10_refactor_fetch_weather/TestFetchWeatherTask.java"
               data-name="3.10_refactor_fetch_weather"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.10_refactor_fetch_weather">
                3.10_refactor_fetch_weather
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.11_add_units_setting/TestFetchWeatherTask.java"
               data-name="3.11_add_units_setting"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.11_add_units_setting">
                3.11_add_units_setting
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.12_add_map_intent/TestFetchWeatherTask.java"
               data-name="3.12_add_map_intent"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.12_add_map_intent">
                3.12_add_map_intent
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.13_add_share_action_provider/TestFetchWeatherTask.java"
               data-name="3.13_add_share_action_provider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.13_add_share_action_provider">
                3.13_add_share_action_provider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.01_life_cycle/TestFetchWeatherTask.java"
               data-name="4.01_life_cycle"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.01_life_cycle">
                4.01_life_cycle
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.02_start_code_for_lesson_4/TestFetchWeatherTask.java"
               data-name="4.02_start_code_for_lesson_4"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.02_start_code_for_lesson_4">
                4.02_start_code_for_lesson_4
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.03_define_contract_constants/TestFetchWeatherTask.java"
               data-name="4.03_define_contract_constants"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.03_define_contract_constants">
                4.03_define_contract_constants
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.04_location_database/TestFetchWeatherTask.java"
               data-name="4.04_location_database"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.04_location_database">
                4.04_location_database
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.05_test_location_table/TestFetchWeatherTask.java"
               data-name="4.05_test_location_table"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.05_test_location_table">
                4.05_test_location_table
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.06_test_weather_table/TestFetchWeatherTask.java"
               data-name="4.06_test_weather_table"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.06_test_weather_table">
                4.06_test_weather_table
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.07_start_code_content_provider/TestFetchWeatherTask.java"
               data-name="4.07_start_code_content_provider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.07_start_code_content_provider">
                4.07_start_code_content_provider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.08_uribuilder_weather_with_location/TestFetchWeatherTask.java"
               data-name="4.08_uribuilder_weather_with_location"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.08_uribuilder_weather_with_location">
                4.08_uribuilder_weather_with_location
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.09_write_uri_matcher/TestFetchWeatherTask.java"
               data-name="4.09_write_uri_matcher"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.09_write_uri_matcher">
                4.09_write_uri_matcher
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.10_register_contentprovider/TestFetchWeatherTask.java"
               data-name="4.10_register_contentprovider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.10_register_contentprovider">
                4.10_register_contentprovider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.11_gettype/TestFetchWeatherTask.java"
               data-name="4.11_gettype"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.11_gettype">
                4.11_gettype
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.12_query/TestFetchWeatherTask.java"
               data-name="4.12_query"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.12_query">
                4.12_query
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.13_insert/TestFetchWeatherTask.java"
               data-name="4.13_insert"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.13_insert">
                4.13_insert
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.14_update_delete/TestFetchWeatherTask.java"
               data-name="4.14_update_delete"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.14_update_delete">
                4.14_update_delete
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.15_refactor_fetchweather/TestFetchWeatherTask.java"
               data-name="4.15_refactor_fetchweather"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.15_refactor_fetchweather">
                4.15_refactor_fetchweather
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.16_use_contentprovider_inserts/TestFetchWeatherTask.java"
               data-name="4.16_use_contentprovider_inserts"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.16_use_contentprovider_inserts">
                4.16_use_contentprovider_inserts
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.17_bulkinserts_with_contentprovider/TestFetchWeatherTask.java"
               data-name="4.17_bulkinserts_with_contentprovider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.17_bulkinserts_with_contentprovider">
                4.17_bulkinserts_with_contentprovider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.18_cursor_adapter/TestFetchWeatherTask.java"
               data-name="4.18_cursor_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.18_cursor_adapter">
                4.18_cursor_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.19_loaders/TestFetchWeatherTask.java"
               data-name="4.19_loaders"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.19_loaders">
                4.19_loaders
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.20_projections/TestFetchWeatherTask.java"
               data-name="4.20_projections"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.20_projections">
                4.20_projections
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.21_details_view/TestFetchWeatherTask.java"
               data-name="4.21_details_view"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.21_details_view">
                4.21_details_view
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.22_fix_details_view/TestFetchWeatherTask.java"
               data-name="4.22_fix_details_view"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.22_fix_details_view">
                4.22_fix_details_view
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.23_fix_settings/TestFetchWeatherTask.java"
               data-name="4.23_fix_settings"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.23_fix_settings">
                4.23_fix_settings
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.01_build_list_item/TestFetchWeatherTask.java"
               data-name="5.01_build_list_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.01_build_list_item">
                5.01_build_list_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.02_build_today_item/TestFetchWeatherTask.java"
               data-name="5.02_build_today_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.02_build_today_item">
                5.02_build_today_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.03_update_forecast_adapter/TestFetchWeatherTask.java"
               data-name="5.03_update_forecast_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.03_update_forecast_adapter">
                5.03_update_forecast_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.04_two_item_view_types/TestFetchWeatherTask.java"
               data-name="5.04_two_item_view_types"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.04_two_item_view_types">
                5.04_two_item_view_types
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.05_viewholder/TestFetchWeatherTask.java"
               data-name="5.05_viewholder"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.05_viewholder">
                5.05_viewholder
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.06_formatting_strings/TestFetchWeatherTask.java"
               data-name="5.06_formatting_strings"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.06_formatting_strings">
                5.06_formatting_strings
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.07_details_screen/TestFetchWeatherTask.java"
               data-name="5.07_details_screen"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.07_details_screen">
                5.07_details_screen
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.08_images/TestFetchWeatherTask.java"
               data-name="5.08_images"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.08_images">
                5.08_images
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.09_two_pane_ui/TestFetchWeatherTask.java"
               data-name="5.09_two_pane_ui"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.09_two_pane_ui">
                5.09_two_pane_ui
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.10_selected_item/TestFetchWeatherTask.java"
               data-name="5.10_selected_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.10_selected_item">
                5.10_selected_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.11_activated_item/TestFetchWeatherTask.java"
               data-name="5.11_activated_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.11_activated_item">
                5.11_activated_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.12_scroll_position/TestFetchWeatherTask.java"
               data-name="5.12_scroll_position"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.12_scroll_position">
                5.12_scroll_position
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.13_alternative_detail_layout/TestFetchWeatherTask.java"
               data-name="5.13_alternative_detail_layout"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.13_alternative_detail_layout">
                5.13_alternative_detail_layout
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.14_today_item_tablet/TestFetchWeatherTask.java"
               data-name="5.14_today_item_tablet"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.14_today_item_tablet">
                5.14_today_item_tablet
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.15_action_bar/TestFetchWeatherTask.java"
               data-name="5.15_action_bar"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.15_action_bar">
                5.15_action_bar
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.16_settings_action_bar/TestFetchWeatherTask.java"
               data-name="5.16_settings_action_bar"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.16_settings_action_bar">
                5.16_settings_action_bar
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.17_redlines_list_item/TestFetchWeatherTask.java"
               data-name="5.17_redlines_list_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.17_redlines_list_item">
                5.17_redlines_list_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.18_redlines_finish/TestFetchWeatherTask.java"
               data-name="5.18_redlines_finish"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.18_redlines_finish">
                5.18_redlines_finish
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.19_accessibility/TestFetchWeatherTask.java"
               data-name="5.19_accessibility"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.19_accessibility">
                5.19_accessibility
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.01_services/TestFetchWeatherTask.java"
               data-name="6.01_services"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.01_services">
                6.01_services
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.02_alarms/TestFetchWeatherTask.java"
               data-name="6.02_alarms"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.02_alarms">
                6.02_alarms
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.03_implement_sync_adapter/TestFetchWeatherTask.java"
               data-name="6.03_implement_sync_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.03_implement_sync_adapter">
                6.03_implement_sync_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.04_finish_sync_adapter/TestFetchWeatherTask.java"
               data-name="6.04_finish_sync_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.04_finish_sync_adapter">
                6.04_finish_sync_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.05_scheduled_sync/TestFetchWeatherTask.java"
               data-name="6.05_scheduled_sync"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.05_scheduled_sync">
                6.05_scheduled_sync
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.06_notifications_quiz/TestFetchWeatherTask.java"
               data-name="6.06_notifications_quiz"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.06_notifications_quiz">
                6.06_notifications_quiz
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.07_notifications_answer/TestFetchWeatherTask.java"
               data-name="6.07_notifications_answer"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.07_notifications_answer">
                6.07_notifications_answer
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.08_turn_off_notifications/TestFetchWeatherTask.java"
               data-name="6.08_turn_off_notifications"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.08_turn_off_notifications">
                6.08_turn_off_notifications
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.09_delete_old_data/TestFetchWeatherTask.java"
               data-name="6.09_delete_old_data"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.09_delete_old_data">
                6.09_delete_old_data
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.10_update_map_intent/TestFetchWeatherTask.java"
               data-name="6.10_update_map_intent"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.10_update_map_intent">
                6.10_update_map_intent
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/initial_commit/TestFetchWeatherTask.java"
               data-name="initial_commit"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="initial_commit">
                initial_commit
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open selected"
               href="/udacity/Sunshine-Version-2/blob/lesson_4_content_provider_starter_code/TestFetchWeatherTask.java"
               data-name="lesson_4_content_provider_starter_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="lesson_4_content_provider_starter_code">
                lesson_4_content_provider_starter_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/lesson_4_starter_code/TestFetchWeatherTask.java"
               data-name="lesson_4_starter_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="lesson_4_starter_code">
                lesson_4_starter_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/lesson_6_sync_adapter_starter_code/TestFetchWeatherTask.java"
               data-name="lesson_6_sync_adapter_starter_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="lesson_6_sync_adapter_starter_code">
                lesson_6_sync_adapter_starter_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/sunshine_master/TestFetchWeatherTask.java"
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
      <span class="repo-root js-repo-root"><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/udacity/Sunshine-Version-2/tree/lesson_4_content_provider_starter_code" class="" data-branch="lesson_4_content_provider_starter_code" data-pjax="true" itemscope="url"><span itemprop="title">Sunshine-Version-2</span></a></span></span><span class="separator">/</span><strong class="final-path">TestFetchWeatherTask.java</strong>
    </div>
  </div>


  <div class="commit file-history-tease">
    <div class="file-history-tease-header">
        <img alt="@ceruleanotter" class="avatar" height="24" src="https://avatars0.githubusercontent.com/u/3414789?v=3&amp;s=48" width="24" />
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
            <img alt="@ceruleanotter" height="24" src="https://avatars0.githubusercontent.com/u/3414789?v=3&amp;s=48" width="24" />
            <a href="/ceruleanotter">ceruleanotter</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file">
  <div class="file-header">
    <div class="file-actions">

      <div class="btn-group">
        <a href="/udacity/Sunshine-Version-2/raw/lesson_4_content_provider_starter_code/TestFetchWeatherTask.java" class="btn btn-sm " id="raw-url">Raw</a>
          <a href="/udacity/Sunshine-Version-2/blame/lesson_4_content_provider_starter_code/TestFetchWeatherTask.java" class="btn btn-sm js-update-url-with-hash">Blame</a>
        <a href="/udacity/Sunshine-Version-2/commits/lesson_4_content_provider_starter_code/TestFetchWeatherTask.java" class="btn btn-sm " rel="nofollow">History</a>
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
        101 lines (97 sloc)
        <span class="file-info-divider"></span>
      5.023 kB
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
        <td id="LC18" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.test.AndroidTestCase</span>;</td>
      </tr>
      <tr>
        <td id="L19" class="blob-num js-line-number" data-line-number="19"></td>
        <td id="LC19" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L20" class="blob-num js-line-number" data-line-number="20"></td>
        <td id="LC20" class="blob-code blob-code-inner js-file-line"><span class="pl-k">public</span> <span class="pl-k">class</span> <span class="pl-en">TestFetchWeatherTask</span> <span class="pl-k">extends</span> <span class="pl-e">AndroidTestCase</span>{</td>
      </tr>
      <tr>
        <td id="L21" class="blob-num js-line-number" data-line-number="21"></td>
        <td id="LC21" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">ADD_LOCATION_SETTING</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>Sunnydale, CA<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L22" class="blob-num js-line-number" data-line-number="22"></td>
        <td id="LC22" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">ADD_LOCATION_CITY</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>Sunnydale<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L23" class="blob-num js-line-number" data-line-number="23"></td>
        <td id="LC23" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-k">double</span> <span class="pl-c1">ADD_LOCATION_LAT</span> <span class="pl-k">=</span> <span class="pl-c1">34.425833</span>;</td>
      </tr>
      <tr>
        <td id="L24" class="blob-num js-line-number" data-line-number="24"></td>
        <td id="LC24" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-k">double</span> <span class="pl-c1">ADD_LOCATION_LON</span> <span class="pl-k">=</span> <span class="pl-k">-</span><span class="pl-c1">119.714167</span>;</td>
      </tr>
      <tr>
        <td id="L25" class="blob-num js-line-number" data-line-number="25"></td>
        <td id="LC25" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L26" class="blob-num js-line-number" data-line-number="26"></td>
        <td id="LC26" class="blob-code blob-code-inner js-file-line">    <span class="pl-c">/*</span></td>
      </tr>
      <tr>
        <td id="L27" class="blob-num js-line-number" data-line-number="27"></td>
        <td id="LC27" class="blob-code blob-code-inner js-file-line"><span class="pl-c">        Students: uncomment testAddLocation after you have written the AddLocation function.</span></td>
      </tr>
      <tr>
        <td id="L28" class="blob-num js-line-number" data-line-number="28"></td>
        <td id="LC28" class="blob-code blob-code-inner js-file-line"><span class="pl-c">        This test will only run on API level 11 and higher because of a requirement in the</span></td>
      </tr>
      <tr>
        <td id="L29" class="blob-num js-line-number" data-line-number="29"></td>
        <td id="LC29" class="blob-code blob-code-inner js-file-line"><span class="pl-c">        content provider.</span></td>
      </tr>
      <tr>
        <td id="L30" class="blob-num js-line-number" data-line-number="30"></td>
        <td id="LC30" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     */</span></td>
      </tr>
      <tr>
        <td id="L31" class="blob-num js-line-number" data-line-number="31"></td>
        <td id="LC31" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//    @TargetApi(11)</span></td>
      </tr>
      <tr>
        <td id="L32" class="blob-num js-line-number" data-line-number="32"></td>
        <td id="LC32" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//    public void testAddLocation() {</span></td>
      </tr>
      <tr>
        <td id="L33" class="blob-num js-line-number" data-line-number="33"></td>
        <td id="LC33" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        // start from a clean state</span></td>
      </tr>
      <tr>
        <td id="L34" class="blob-num js-line-number" data-line-number="34"></td>
        <td id="LC34" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        getContext().getContentResolver().delete(WeatherContract.LocationEntry.CONTENT_URI,</span></td>
      </tr>
      <tr>
        <td id="L35" class="blob-num js-line-number" data-line-number="35"></td>
        <td id="LC35" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                WeatherContract.LocationEntry.COLUMN_LOCATION_SETTING + &quot; = ?&quot;,</span></td>
      </tr>
      <tr>
        <td id="L36" class="blob-num js-line-number" data-line-number="36"></td>
        <td id="LC36" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                new String[]{ADD_LOCATION_SETTING});</span></td>
      </tr>
      <tr>
        <td id="L37" class="blob-num js-line-number" data-line-number="37"></td>
        <td id="LC37" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//</span></td>
      </tr>
      <tr>
        <td id="L38" class="blob-num js-line-number" data-line-number="38"></td>
        <td id="LC38" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        FetchWeatherTask fwt = new FetchWeatherTask(getContext(), null);</span></td>
      </tr>
      <tr>
        <td id="L39" class="blob-num js-line-number" data-line-number="39"></td>
        <td id="LC39" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        long locationId = fwt.addLocation(ADD_LOCATION_SETTING, ADD_LOCATION_CITY,</span></td>
      </tr>
      <tr>
        <td id="L40" class="blob-num js-line-number" data-line-number="40"></td>
        <td id="LC40" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                ADD_LOCATION_LAT, ADD_LOCATION_LON);</span></td>
      </tr>
      <tr>
        <td id="L41" class="blob-num js-line-number" data-line-number="41"></td>
        <td id="LC41" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//</span></td>
      </tr>
      <tr>
        <td id="L42" class="blob-num js-line-number" data-line-number="42"></td>
        <td id="LC42" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        // does addLocation return a valid record ID?</span></td>
      </tr>
      <tr>
        <td id="L43" class="blob-num js-line-number" data-line-number="43"></td>
        <td id="LC43" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        assertFalse(&quot;Error: addLocation returned an invalid ID on insert&quot;,</span></td>
      </tr>
      <tr>
        <td id="L44" class="blob-num js-line-number" data-line-number="44"></td>
        <td id="LC44" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                locationId == -1);</span></td>
      </tr>
      <tr>
        <td id="L45" class="blob-num js-line-number" data-line-number="45"></td>
        <td id="LC45" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//</span></td>
      </tr>
      <tr>
        <td id="L46" class="blob-num js-line-number" data-line-number="46"></td>
        <td id="LC46" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        // test all this twice</span></td>
      </tr>
      <tr>
        <td id="L47" class="blob-num js-line-number" data-line-number="47"></td>
        <td id="LC47" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        for ( int i = 0; i &lt; 2; i++ ) {</span></td>
      </tr>
      <tr>
        <td id="L48" class="blob-num js-line-number" data-line-number="48"></td>
        <td id="LC48" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//</span></td>
      </tr>
      <tr>
        <td id="L49" class="blob-num js-line-number" data-line-number="49"></td>
        <td id="LC49" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//            // does the ID point to our location?</span></td>
      </tr>
      <tr>
        <td id="L50" class="blob-num js-line-number" data-line-number="50"></td>
        <td id="LC50" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//            Cursor locationCursor = getContext().getContentResolver().query(</span></td>
      </tr>
      <tr>
        <td id="L51" class="blob-num js-line-number" data-line-number="51"></td>
        <td id="LC51" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                    WeatherContract.LocationEntry.CONTENT_URI,</span></td>
      </tr>
      <tr>
        <td id="L52" class="blob-num js-line-number" data-line-number="52"></td>
        <td id="LC52" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                    new String[]{</span></td>
      </tr>
      <tr>
        <td id="L53" class="blob-num js-line-number" data-line-number="53"></td>
        <td id="LC53" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                            WeatherContract.LocationEntry._ID,</span></td>
      </tr>
      <tr>
        <td id="L54" class="blob-num js-line-number" data-line-number="54"></td>
        <td id="LC54" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                            WeatherContract.LocationEntry.COLUMN_LOCATION_SETTING,</span></td>
      </tr>
      <tr>
        <td id="L55" class="blob-num js-line-number" data-line-number="55"></td>
        <td id="LC55" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                            WeatherContract.LocationEntry.COLUMN_CITY_NAME,</span></td>
      </tr>
      <tr>
        <td id="L56" class="blob-num js-line-number" data-line-number="56"></td>
        <td id="LC56" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                            WeatherContract.LocationEntry.COLUMN_COORD_LAT,</span></td>
      </tr>
      <tr>
        <td id="L57" class="blob-num js-line-number" data-line-number="57"></td>
        <td id="LC57" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                            WeatherContract.LocationEntry.COLUMN_COORD_LONG</span></td>
      </tr>
      <tr>
        <td id="L58" class="blob-num js-line-number" data-line-number="58"></td>
        <td id="LC58" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                    },</span></td>
      </tr>
      <tr>
        <td id="L59" class="blob-num js-line-number" data-line-number="59"></td>
        <td id="LC59" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                    WeatherContract.LocationEntry.COLUMN_LOCATION_SETTING + &quot; = ?&quot;,</span></td>
      </tr>
      <tr>
        <td id="L60" class="blob-num js-line-number" data-line-number="60"></td>
        <td id="LC60" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                    new String[]{ADD_LOCATION_SETTING},</span></td>
      </tr>
      <tr>
        <td id="L61" class="blob-num js-line-number" data-line-number="61"></td>
        <td id="LC61" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                    null);</span></td>
      </tr>
      <tr>
        <td id="L62" class="blob-num js-line-number" data-line-number="62"></td>
        <td id="LC62" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//</span></td>
      </tr>
      <tr>
        <td id="L63" class="blob-num js-line-number" data-line-number="63"></td>
        <td id="LC63" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//            // these match the indices of the projection</span></td>
      </tr>
      <tr>
        <td id="L64" class="blob-num js-line-number" data-line-number="64"></td>
        <td id="LC64" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//            if (locationCursor.moveToFirst()) {</span></td>
      </tr>
      <tr>
        <td id="L65" class="blob-num js-line-number" data-line-number="65"></td>
        <td id="LC65" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                assertEquals(&quot;Error: the queried value of locationId does not match the returned value&quot; +</span></td>
      </tr>
      <tr>
        <td id="L66" class="blob-num js-line-number" data-line-number="66"></td>
        <td id="LC66" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                        &quot;from addLocation&quot;, locationCursor.getLong(0), locationId);</span></td>
      </tr>
      <tr>
        <td id="L67" class="blob-num js-line-number" data-line-number="67"></td>
        <td id="LC67" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                assertEquals(&quot;Error: the queried value of location setting is incorrect&quot;,</span></td>
      </tr>
      <tr>
        <td id="L68" class="blob-num js-line-number" data-line-number="68"></td>
        <td id="LC68" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                        locationCursor.getString(1), ADD_LOCATION_SETTING);</span></td>
      </tr>
      <tr>
        <td id="L69" class="blob-num js-line-number" data-line-number="69"></td>
        <td id="LC69" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                assertEquals(&quot;Error: the queried value of location city is incorrect&quot;,</span></td>
      </tr>
      <tr>
        <td id="L70" class="blob-num js-line-number" data-line-number="70"></td>
        <td id="LC70" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                        locationCursor.getString(2), ADD_LOCATION_CITY);</span></td>
      </tr>
      <tr>
        <td id="L71" class="blob-num js-line-number" data-line-number="71"></td>
        <td id="LC71" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                assertEquals(&quot;Error: the queried value of latitude is incorrect&quot;,</span></td>
      </tr>
      <tr>
        <td id="L72" class="blob-num js-line-number" data-line-number="72"></td>
        <td id="LC72" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                        locationCursor.getDouble(3), ADD_LOCATION_LAT);</span></td>
      </tr>
      <tr>
        <td id="L73" class="blob-num js-line-number" data-line-number="73"></td>
        <td id="LC73" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                assertEquals(&quot;Error: the queried value of longitude is incorrect&quot;,</span></td>
      </tr>
      <tr>
        <td id="L74" class="blob-num js-line-number" data-line-number="74"></td>
        <td id="LC74" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                        locationCursor.getDouble(4), ADD_LOCATION_LON);</span></td>
      </tr>
      <tr>
        <td id="L75" class="blob-num js-line-number" data-line-number="75"></td>
        <td id="LC75" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//            } else {</span></td>
      </tr>
      <tr>
        <td id="L76" class="blob-num js-line-number" data-line-number="76"></td>
        <td id="LC76" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                fail(&quot;Error: the id you used to query returned an empty cursor&quot;);</span></td>
      </tr>
      <tr>
        <td id="L77" class="blob-num js-line-number" data-line-number="77"></td>
        <td id="LC77" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//            }</span></td>
      </tr>
      <tr>
        <td id="L78" class="blob-num js-line-number" data-line-number="78"></td>
        <td id="LC78" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//</span></td>
      </tr>
      <tr>
        <td id="L79" class="blob-num js-line-number" data-line-number="79"></td>
        <td id="LC79" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//            // there should be no more records</span></td>
      </tr>
      <tr>
        <td id="L80" class="blob-num js-line-number" data-line-number="80"></td>
        <td id="LC80" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//            assertFalse(&quot;Error: there should be only one record returned from a location query&quot;,</span></td>
      </tr>
      <tr>
        <td id="L81" class="blob-num js-line-number" data-line-number="81"></td>
        <td id="LC81" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                    locationCursor.moveToNext());</span></td>
      </tr>
      <tr>
        <td id="L82" class="blob-num js-line-number" data-line-number="82"></td>
        <td id="LC82" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//</span></td>
      </tr>
      <tr>
        <td id="L83" class="blob-num js-line-number" data-line-number="83"></td>
        <td id="LC83" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//            // add the location again</span></td>
      </tr>
      <tr>
        <td id="L84" class="blob-num js-line-number" data-line-number="84"></td>
        <td id="LC84" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//            long newLocationId = fwt.addLocation(ADD_LOCATION_SETTING, ADD_LOCATION_CITY,</span></td>
      </tr>
      <tr>
        <td id="L85" class="blob-num js-line-number" data-line-number="85"></td>
        <td id="LC85" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                    ADD_LOCATION_LAT, ADD_LOCATION_LON);</span></td>
      </tr>
      <tr>
        <td id="L86" class="blob-num js-line-number" data-line-number="86"></td>
        <td id="LC86" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//</span></td>
      </tr>
      <tr>
        <td id="L87" class="blob-num js-line-number" data-line-number="87"></td>
        <td id="LC87" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//            assertEquals(&quot;Error: inserting a location again should return the same ID&quot;,</span></td>
      </tr>
      <tr>
        <td id="L88" class="blob-num js-line-number" data-line-number="88"></td>
        <td id="LC88" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                    locationId, newLocationId);</span></td>
      </tr>
      <tr>
        <td id="L89" class="blob-num js-line-number" data-line-number="89"></td>
        <td id="LC89" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        }</span></td>
      </tr>
      <tr>
        <td id="L90" class="blob-num js-line-number" data-line-number="90"></td>
        <td id="LC90" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        // reset our state back to normal</span></td>
      </tr>
      <tr>
        <td id="L91" class="blob-num js-line-number" data-line-number="91"></td>
        <td id="LC91" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        getContext().getContentResolver().delete(WeatherContract.LocationEntry.CONTENT_URI,</span></td>
      </tr>
      <tr>
        <td id="L92" class="blob-num js-line-number" data-line-number="92"></td>
        <td id="LC92" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                WeatherContract.LocationEntry.COLUMN_LOCATION_SETTING + &quot; = ?&quot;,</span></td>
      </tr>
      <tr>
        <td id="L93" class="blob-num js-line-number" data-line-number="93"></td>
        <td id="LC93" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                new String[]{ADD_LOCATION_SETTING});</span></td>
      </tr>
      <tr>
        <td id="L94" class="blob-num js-line-number" data-line-number="94"></td>
        <td id="LC94" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//</span></td>
      </tr>
      <tr>
        <td id="L95" class="blob-num js-line-number" data-line-number="95"></td>
        <td id="LC95" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        // clean up the test so that other tests can use the content provider</span></td>
      </tr>
      <tr>
        <td id="L96" class="blob-num js-line-number" data-line-number="96"></td>
        <td id="LC96" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        getContext().getContentResolver().</span></td>
      </tr>
      <tr>
        <td id="L97" class="blob-num js-line-number" data-line-number="97"></td>
        <td id="LC97" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                acquireContentProviderClient(WeatherContract.LocationEntry.CONTENT_URI).</span></td>
      </tr>
      <tr>
        <td id="L98" class="blob-num js-line-number" data-line-number="98"></td>
        <td id="LC98" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                getLocalContentProvider().shutdown();</span></td>
      </tr>
      <tr>
        <td id="L99" class="blob-num js-line-number" data-line-number="99"></td>
        <td id="LC99" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//    }</span></td>
      </tr>
      <tr>
        <td id="L100" class="blob-num js-line-number" data-line-number="100"></td>
        <td id="LC100" class="blob-code blob-code-inner js-file-line">}</td>
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
      <li>&copy; 2015 <span title="0.03748s from github-fe139-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
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

