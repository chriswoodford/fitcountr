App = Ember.Application.create({
  LOG_TRANSITIONS: true
});

App.Router.map(function() {
  this.route("home", { path: "/" });
});

var home = Ember.View.create({
  templateName: "home"
});
