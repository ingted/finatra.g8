resolvers += Resolver.url("bintray-sbt-plugin-releases", url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(
  Resolver.ivyStylePatterns
)
resolvers += Classpaths.sbtPluginReleases

addSbtPlugin("io.get-coursier"                % "sbt-coursier"               % "1.1.0-M13-4")
addSbtPlugin("ch.epfl.scala"                  % "sbt-scalafix"               % "0.9.5")
addSbtPlugin("au.com.onegeek"                 %% "sbt-dotenv"                % "2.0.117")
addSbtPlugin("com.github.gseitz"              % "sbt-release"                % "1.0.11")
addSbtPlugin("com.typesafe.sbt"               % "sbt-git"                    % "0.9.3")
addSbtPlugin("com.softwaremill.clippy"        % "plugin-sbt"                 % "0.6.1")
addSbtPlugin("com.sksamuel.scapegoat"         %% "sbt-scapegoat"             % "1.0.9")
addSbtPlugin("org.scoverage"                  % "sbt-scoverage"              % "1.5.1")
addSbtPlugin("org.scalameta"                  % "sbt-scalafmt"               % "2.0.0")
addSbtPlugin("org.duhemm"                     % "sbt-errors-summary"         % "0.6.3")
addSbtPlugin("com.birdhowl"                   % "sbt-mfinger"                % "0.1.0")
addSbtPlugin("com.timushev.sbt"               % "sbt-updates"                % "0.4.1")
addSbtPlugin("org.scalastyle"                 %% "scalastyle-sbt-plugin"     % "1.0.0")
addSbtPlugin("com.mintbeans"                  % "sbt-ecr"                    % "0.14.1")
addSbtPlugin("net.virtual-void"               % "sbt-dependency-graph"       % "0.9.2")
addSbtPlugin("org.programmiersportgruppe.sbt" %% "tabulartestreporter"       % "4.1.0")
addSbtPlugin("org.scalameta"                  % "sbt-mdoc"                   % "1.3.1")
addSbtPlugin("com.github.cb372"               % "sbt-explicit-dependencies"  % "0.2.9")
addSbtPlugin("org.wartremover"                % "sbt-wartremover"            % "2.4.2")
addSbtPlugin("com.github.sbt"                 % "sbt-cpd"                    % "2.0.0")
addSbtPlugin("com.lightbend.paradox"          % "sbt-paradox"                % "0.6.0")
addSbtPlugin("io.github.jonas"                % "sbt-paradox-material-theme" % "0.6.0")
addSbtPlugin("com.dwijnand"                   % "sbt-reloadquick"            % "1.0.0")
addSbtPlugin("net.virtual-void"               % "sbt-optimizer"              % "0.1.2")
